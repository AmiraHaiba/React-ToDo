package com.eventum.todo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventum.todo.entity.Note;
import com.eventum.todo.service.NotesService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/notes")
public class NotesController {
	
	@Autowired
	private NotesService notesService;
	
	@GetMapping("/all")
	public String getNotes() {
		List<Note> notes = notesService.getAllNotes();
//		Map<String, Note> map = getMap(notes);
//		ObjectMapper mapper = new ObjectMapper();
		Gson gson = new Gson();
		return gson.toJson(notes);
//		try {
//			json = mapper.writeValueAsString(map);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    return json;
	}
	
//	Map<String, Note> getMap(List<Note> notes) {
//		Map<String, Note> map = new HashMap<>();
//		for(Note note : notes) {
//			map.put(note.getId() + "", note);
//		}
//		return map;
//	}
	
	@GetMapping("/one")
	public Note getNote() {
		return notesService.getOneNote();
	}
	
}
