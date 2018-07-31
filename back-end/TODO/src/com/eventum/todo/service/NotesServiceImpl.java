package com.eventum.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventum.todo.dao.NotesDAO;
import com.eventum.todo.entity.Note;

@Service
public class NotesServiceImpl implements NotesService {

	@Autowired
	private NotesDAO notesDAO;
	
	@Override
	@Transactional
	public List<Note> getAllNotes() {
		return notesDAO.getAllNotes();
	}

	@Override
	public Note getOneNote() {
		Note note = new Note();
		note.setId(5);
		note.setText("test note");
		note.setUserId(1);
		return note;
	}
	
}
