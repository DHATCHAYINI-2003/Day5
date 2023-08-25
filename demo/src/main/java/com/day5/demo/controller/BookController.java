package com.day5.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day5.demo.model.Book;
import com.day5.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService service;

	@PostMapping("add")
	public Book adddetails(@RequestBody Book b) {
		return service.saveinfo(b);
	}

	@GetMapping("display")
	public List<Book> show() {
		return service.show();
	}

	@PutMapping("change")
	public Book Update(@RequestBody Book b) {
		return service.updateinfo(b);
	}

	@DeleteMapping("delete")
	public void Del(@RequestBody Book b) {
		 service.del(b);
	}

	@DeleteMapping("delete/{id}")
	public void deid(@PathVariable int id) {
		service.deleteid(id);
		
	}
}
