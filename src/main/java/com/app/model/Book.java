package com.app.model;


public class Book {
	
	private Integer bookId;
	private String bookCode;
	private String bookAuthor;
	private Double bookCost;
	public Book() {
		super();
	}
	public Book(Integer bookId, String bookCode, String bookAuthor, Double bookCost) {
		super();
		this.bookId = bookId;
		this.bookCode = bookCode;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookCode=" + bookCode + ", bookAuthor=" + bookAuthor + ", bookCost="
				+ bookCost + "]";
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	
}
