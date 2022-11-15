package com.github.hadesfranklyn.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.hadesfranklyn.bookservice.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
