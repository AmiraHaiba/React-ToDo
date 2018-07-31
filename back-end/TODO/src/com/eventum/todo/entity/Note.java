package com.eventum.todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Notes")
public class Note {
	
	@Id
	@Column(name = "NoteId")
	private int id;
	
	@Column(name = "UserId")
	private int userId;
	
	@Column(name = "Text")
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Note() {
		super();
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", userId=" + userId + ", text=" + text + "]";
	}	
	
}
