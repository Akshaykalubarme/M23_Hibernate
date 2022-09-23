package com.cg.services;

import java.util.List;

import com.cg.entities.Book;

public interface BookService 
{
	//abstract method by default
	public abstract void save(Book book);
	public abstract Book getBookById(Integer id);
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookcount();
	public abstract List<Book> getBookByAuthor(String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getBookRange(Double low, Double High);

}
