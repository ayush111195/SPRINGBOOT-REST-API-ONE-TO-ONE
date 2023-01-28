package com.springboot.rest.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	
	private String authodName;
	private String lastName;
	private String langauge;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthodName() {
		return authodName;
	}
	public void setAuthodName(String authodName) {
		this.authodName = authodName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public Author(int authorId, String authodName, String lastName, String langauge) {
		super();
		this.authorId = authorId;
		this.authodName = authodName;
		this.lastName = lastName;
		this.langauge = langauge;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authodName=" + authodName + ", lastName=" + lastName + ", langauge="
				+ langauge + "]";
	};

}
