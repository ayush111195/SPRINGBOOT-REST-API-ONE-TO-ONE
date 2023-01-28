package com.springboot.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.BookRepository;
import com.springboot.rest.entites.Book;

@Service
public class Services {

	@Autowired
	private BookRepository boookRepository;

	// get all book--->>

	public List<Book> getAllBook() {

		List<Book> list = (List<Book>) this.boookRepository.findAll();

		return list;

	}

	// get single book by id---->>>

	public Book getBookById(int id) {

		Book book = null;
		try {
			book = this.boookRepository.findById(id);

		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return book;

	}

	// Add the book---->>>

	public Book addBook(Book b) {
		Book save = boookRepository.save(b);
		return save;
	}

	// delete the book by id---->>>

	public void dltBook(int bid) {
		boookRepository.deleteById(bid);
	}

	// update the book--->>
	public void updateBook(Book book, int id) {
		book.setId(id);
		boookRepository.save(book);
	}
}
