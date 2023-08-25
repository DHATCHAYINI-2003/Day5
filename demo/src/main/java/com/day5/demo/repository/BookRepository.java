package com.day5.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.day5.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}