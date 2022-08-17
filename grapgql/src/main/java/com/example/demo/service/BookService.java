package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public Book create(Book book) {
		return this.bookRepo.save(book);
	}
	
	public List<Book> getAll(){
		return this.bookRepo.findAll();
	}
	
	public Book get(int bookId) {
		return this.bookRepo.findById(bookId).orElseThrow(()-> new RuntimeException("Book not present"));
	}
	
}
