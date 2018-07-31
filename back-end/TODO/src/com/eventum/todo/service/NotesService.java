package com.eventum.todo.service;

import java.util.List;

import com.eventum.todo.entity.Note;

public interface NotesService {
	List<Note> getAllNotes();

	Note getOneNote();
}
