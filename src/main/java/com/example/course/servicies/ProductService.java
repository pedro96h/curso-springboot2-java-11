package com.example.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById (Long id) {
		Optional<Product> obj = productRepository.findById(id);
		if(obj.isPresent()) {
			return obj.get();			
		} else {
			return null;
		}
	}
}
