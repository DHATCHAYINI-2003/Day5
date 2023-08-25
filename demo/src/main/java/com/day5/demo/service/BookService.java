package com.day5.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.demo.model.Book;
import com.day5.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository repository;

	public Book saveinfo(Book b) {
		return repository.save(b);
	}

	public List<Book> show() {
		return repository.findAll();
	}

	public Book updateinfo(Book b) {
		return repository.saveAndFlush(b);
	}

	public void del(Book b) {
		repository.delete(b);
	}

	public void deleteid(int id) {
		repository.deleteById(id);
	}
}