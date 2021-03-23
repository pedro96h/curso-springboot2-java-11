package com.example.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById (Long id) {
		Optional<User> obj = userRepository.findById(id);
		if(obj.isPresent()) {
			return obj.get();			
		} else {
			return null;
		}
	}
	
	public User insert(User obj) {
	  	return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
