package com.eventum.todo.dao;

import java.util.List;

import com.eventum.todo.entity.Note;

public interface NotesDAO {
	List<Note> getAllNotes();
}
