package com.eventum.todo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eventum.todo.entity.Note;

@Repository
public class NotesDAOImpl implements NotesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Note> getAllNotes() {
		Session session = sessionFactory.getCurrentSession();
		Query<Note> query = session.createQuery("from Note", Note.class);
		return query.getResultList();
	}
	
}
