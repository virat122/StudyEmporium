 package com.entitys;

public class Book {

	private String name;
	private String auther;
	private String publication;
	private String prize;
	
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String auther, String publication, String prize) {
		super();
		this.name = name;
		this.auther = auther;
		this.publication = publication;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;

	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", auther=" + auther + ", publication=" + publication + ", prize=" + prize + "]";
	}
	
}
