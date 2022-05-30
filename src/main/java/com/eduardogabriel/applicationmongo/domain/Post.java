package com.eduardogabriel.applicationmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.eduardogabriel.applicationmongo.dto.AuthorDTO;
import com.eduardogabriel.applicationmongo.dto.CommentDTO;

@Document
public class Post implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private Date data;
	private String titulo;
	private String body;
	private AuthorDTO autor;
	
	private List<CommentDTO> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(String id, Date data, String titulo, String body, AuthorDTO autor) {
		this.id = id;
		this.data = data;
		this.titulo = titulo;
		this.body = body;
		this.autor = autor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public AuthorDTO getAutor() {
		return autor;
	}

	public void setAutor(AuthorDTO autor) {
		this.autor = autor;
	}
	
	public List<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}
}
