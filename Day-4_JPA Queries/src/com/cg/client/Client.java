package com.cg.client;

import com.cg.entities.Book;
import com.cg.services.BookService;
import com.cg.services.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		BookService service=new BookServiceImpl();
		
		Book b=new Book();
		b.setId(15);
		b.setTitle("C programing");
		b.setAuthor("YashwANT Kanetkar");
		b.setPrice(550.00);
		service.save(b);
		
		System.out.println("The data is updated");
		System.out.println("Book with ID: 15"+service.getBookById(15));

	}

}
