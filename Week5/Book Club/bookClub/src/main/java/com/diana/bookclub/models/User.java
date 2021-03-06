package com.diana.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message="Name required!")
	@Size(min =2, max=200)
	private String name;

	@NotEmpty(message="Email required!")
	@Email(message="Email required!")
	private String email;

	@NotEmpty(message="Password required!")
    	@Size(min=8, max=200, message="Password must be between 8 and 200 characters")
	private String password;

	@Transient
    	@NotEmpty(message="Confirm Password required!")
    	@Size(min=8, max=200, message="Confirm Password must be between 8 and 200 characters")
    	private String confirm;

	@Column(updatable=false)
    	@DateTimeFormat(pattern="yyyy-MM-dd")
    	private Date createdAt;
    	@DateTimeFormat(pattern="yyyy-MM-dd")
    	private Date updatedAt;
	
	public User() {
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}


	// Getters & Setters


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getConfirm() {
			return confirm;
		}

		public void setConfirm(String confirm) {
			this.confirm = confirm;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdateAt() {
			return updatedAt;
		}

		public void setUpdateAt(Date updateAt) {
			this.updatedAt = updateAt;
		} 
	}
