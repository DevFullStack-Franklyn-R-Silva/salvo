package com.github.hadesfranklyn.bookservice.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.hadesfranklyn.bookservice.model.Book;
import com.github.hadesfranklyn.bookservice.proxy.CambioProxy;
import com.github.hadesfranklyn.bookservice.repository.BookRepository;
import com.github.hadesfranklyn.bookservice.response.Cambio;

@RestController
@RequestMapping("book-service")
public class BookController {
	
	// https://github.com/flyway/flyway
	// https://martinfowler.com/articles/evodb.html
	/*
	 * Evolua seu esquema de banco de dados de maneira fácil e confiável em todas as suas instâncias.
Simples, focado e poderoso.
	 * */
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CambioProxy proxy;
	
//	@GetMapping(value = "/{id}/{currency}")	
//	public Book findBook(
//			@PathVariable("id") Long id,
//			@PathVariable("currency") String currency
//			) {
//		
//		@SuppressWarnings("deprecation")
//		var book = repository.getById(id);
//		if (book == null) throw new RuntimeException("Book not Found");
//				
//		var cambio = proxy.getCambio(book.getPrice(), "USD", currency);
//		
//		var port = environment.getProperty("local.server.port");
//		book.setEnvironment(port + " FEIGN");
//		book.setPrice(cambio.getConvertedValue());
//		return book;
//	}
	
//	@GetMapping(value = "/{id}/{currency}")
//	public Book getCambio(
//			@PathVariable("id") Long id,
//			@PathVariable("currency") String currency) {
//
//		var book = repository.getById(id);
//		if (book == null) throw new RuntimeException("Book not Found");
//
//		var port = environment.getProperty("local.server.port");
//
//		book.setEnvironment(port);
//		
//
//		return book;
//	}
	
	
	@GetMapping(value = "/{id}/{currency}")	
	public Book findBook(
			@PathVariable("id") Long id,
			@PathVariable("currency") String currency
			) {
		
		var book = repository.getById(id);
		if (book == null) throw new RuntimeException("Book not Found");
		
		HashMap<String, String> params = new HashMap<>();
		params.put("amount", book.getPrice().toString());
		params.put("from", "USD");
		params.put("to", currency);
		
		var response = new RestTemplate()
				.getForEntity("http://localhost:8000/cambio-service/"
						+ "{amount}/{from}/{to}", 
						Cambio.class,
						params);
		
		var cambio = response.getBody();
		
		var port = environment.getProperty("local.server.port");
		book.setEnvironment(port);
		book.setPrice(cambio.getConvertedValue());
		return book;
	}
}
