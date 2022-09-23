package com.cg.dao;

import java.util.List;

import com.cg.entities.Book;

public interface BookDao 
{
	//abstract method by default
	//All are user defined method
	public abstract void addBook(Book book);
	public abstract Book getBookById(Integer id);
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookcount();
	public abstract List<Book> getBookByAuthor(String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getBookRange(Double low, Double High);
}
