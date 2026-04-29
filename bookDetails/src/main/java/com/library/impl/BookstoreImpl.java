package com.library.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.beans.BookEntity;
import com.library.service.BookRepository;
import com.library.service.BookStore;
@Service
public class BookstoreImpl implements BookStore {

	@Autowired
    private BookRepository  bookStore;
	@Override
	public BookEntity saveBook1(BookEntity entity) {
		// TODO Auto-generated method stub
		bookStore.save(entity);
		return entity;
	}
	
	@Override
	public List<BookEntity> getAllBooks() {
		// TODO Auto-generated method stub
		
		return bookStore.findAll();
	}
	
	@Override
	public Optional<BookEntity> getBookById(String id) {
		// TODO Auto-generated method stub
		
		return bookStore.findById(Long.parseLong(id));
	}

}
