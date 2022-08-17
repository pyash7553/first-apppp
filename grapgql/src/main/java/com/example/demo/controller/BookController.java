package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	

	public Book create(@RequestBody Book book) {
		return this.bookService.create(book);
	}
	
	@QueryMapping("allBooks")
	public List<Book> getAll(){
		return this.bookService.getAll();
	}
	
	@QueryMapping("getBook")
	public Book get(@Argument int bookId) {
		return this.bookService.get(bookId);
	}
	
}
