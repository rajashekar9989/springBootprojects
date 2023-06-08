package com.twg.springboot.mydiary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springboot.mydiary.entity.User;
import com.twg.springboot.mydiary.repository.UserRepository;

 
@Service
public class UserServiceImpl implements UserService {

@Autowired
private	UserRepository  userRepository;
	
	@Override
	public User saveUser(User users) {
		return userRepository.save(users);
	}

	@Override
	public User userupdate(User users) {
		return  userRepository.save(users);
	}

	@Override
	public void deleteUser(User users) {
		
		
		userRepository.delete(users);
	}

	@Override
	public User findById(long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User findByUserName(String username) {
		return userRepository.findByUserName(username);
	}

}
