package com.cg.services;

import java.util.List;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.entities.Book;

public class BookServiceImpl implements BookService 
{
	private BookDao dao;
	

	public BookServiceImpl() {
		super();
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookById(Integer id) {
		return dao.getBookById(id);

	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookcount() {
		return dao.getBookcount();
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		return dao.getBookByAuthor(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBookRange(Double low, Double High) {
		
		return dao.getBookRange(low, High);
	}

	@Override
	public void save(Book book) {
		 dao.addBook(book);
		
	}

}
