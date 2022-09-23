package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.entities.Book;

public class BookDaoImpl implements BookDao 
{
	private EntityManager em;
	
	public BookDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookById(Integer id) {
		Book b=em.find(Book.class, id);
		return b;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String str="SELECT b FROM BOOK b WHERE b.title=:ptitle";
		TypedQuery<Book> query=em.createQuery(str,Book.class);
		query.setParameter("ptitle","%"+ title);
		return query.getResultList();
	}

	@Override
	public Long getBookcount() {
		String str="SELECT COUNT(b.id) FROM Book b";
		TypedQuery<Long> query=em.createQuery(str,Long.class);
		Long count=query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		String str="SELECT b FROM BOOK b WHERE b.author=:pAuthor";
		TypedQuery<Book> query=em.createQuery(str,Book.class);
		query.setParameter("PAuthor", author);
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBooks() {
		String str="SELECT b FROM BOOK b";
		TypedQuery<Book> query= em.createQuery(str,Book.class);
		List<Book> obj=query.getResultList();
		return obj;
		}

	@Override
	public List<Book> getBookRange(Double low, Double High) {
		String str="SELECT b FROM BOOK b WHERE b.price betwen :plow and :phigh";
		TypedQuery<Book> query=em.createQuery(str,Book.class);
		query.setParameter("plow", low);
		query.setParameter("plow", High);
		return query.getResultList();
	}

	@Override
	public void addBook(Book book) {
		em.persist(book);
		em.getTransaction().commit();
		
	}

}
