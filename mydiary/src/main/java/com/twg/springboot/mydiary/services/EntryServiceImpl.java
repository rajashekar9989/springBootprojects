package com.twg.springboot.mydiary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springboot.mydiary.entity.Entry;
import com.twg.springboot.mydiary.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {
	
	@Autowired
	private EntryRepository entryRepository;

	@Override
	public Entry saveEntry(Entry entries) {
		return  entryRepository.save(entries);
	}

	@Override
	public Entry updateEntry(Entry entries) {
		return entryRepository.save(entries);
	}

	@Override
	public void deleteEntry(Entry entries) {
		
		entryRepository.delete(entries);
		

	}

	@Override
	public Entry findById(long id) {
		return entryRepository.findById(id).get();
	}

	@Override
	public List<Entry> findAll() {
		return  entryRepository.findAll();
	}

	@Override
	public List<Entry> findByuserid(long id) {
		return entryRepository.findByUsersid(id);
	}

}
