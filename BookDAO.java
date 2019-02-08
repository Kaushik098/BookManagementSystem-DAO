package com.kaushik.bookSMS.dao;

import java.util.List;

import com.kaushik.bookSMS.model.Book;
import com.kaushik.bookSMS.model.Purchase;
import com.kaushik.bookSMS.model.User;

public interface BookDAO {

	void addBook(Book book);
	
	List<Book> getAllBooks();
	
	Book getBookByID(int id);
	
	Purchase buyBook(User user, int bookID);
}
