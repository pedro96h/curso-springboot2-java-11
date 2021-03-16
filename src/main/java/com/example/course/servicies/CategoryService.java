package com.example.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById (Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		if(obj.isPresent()) {
			return obj.get();			
		} else {
			return null;
		}
	}
}
