package com.diana.bookclub.models;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Book title cannot be left blank!")
	private String title;
	
	@NotEmpty(message="Author field cannot be left blank!")
	private String author;
	
	@NotEmpty(message="Comment field cannot be left blank!")
	private String comment;

	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="postedBy")
	private User user;
	
	public Book() {
	}
	
	public Book(String title, String author, User user) {
		this.title = title;
		this.author = author;
		this.user = user;
	}

		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
			this.id = id;
		}
	
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String getAuthor() {
			return author;
		}
	
		public void setAuthor(String author) {
			this.author = author;
		}
	
		public String getComment() {
			return comment;
		}
	
		public void setComment(String comment) {
			this.comment = comment;
		}
	
		public Date getCreatedAt() {
			return createdAt;
		}
	
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
	
		public Date getUpdatedAt() {
			return updatedAt;
		}
	
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
	
		public User getUser() {
			return user;
		}
	
		public void setUser(User user) {
			this.user = user;
		}
		
	}
