package com.springboot.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.rest.entites.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

	public Book findById(int id);
}
