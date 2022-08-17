package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@SpringBootApplication
public class GrapgqlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GrapgqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book();
		b1.setId(1);
		b1.setTitle("java");
		b1.setDescr("java book");
		b1.setAuthor("herry");
		
		Book b2=new Book();
		b2.setId(2);
		b2.setTitle("java 2");
		b2.setDescr("java book 2");
		b2.setAuthor("herry 2");
		
		this.bookService.create(b1);
		this.bookService.create(b2);
		
	}

}
