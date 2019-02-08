package com.kaushik.bookSMS.dao;

import java.util.List;

import com.kaushik.bookSMS.model.Book;

public interface BillDAO {

	 List<Book> genrateBill(int quantity, int bookID);
	 
}
