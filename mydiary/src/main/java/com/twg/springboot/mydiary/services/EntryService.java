package com.twg.springboot.mydiary.services;

import java.util.List;

import com.twg.springboot.mydiary.entity.Entry;

public interface EntryService {
	
	
	 public Entry saveEntry(Entry entries);
	 
	 public Entry updateEntry(Entry entries);
	 
	 public void deleteEntry(Entry entries);
	 
	 public Entry findById(long id);
	 
	 public List<Entry> findAll();
	 
	 public List<Entry> findByuserid(long id);
	 
	 

}
