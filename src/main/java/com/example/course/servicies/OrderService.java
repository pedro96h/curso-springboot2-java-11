package com.example.course.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> obj = OrderRepository.findById(id);
		if(obj.isPresent()) {
			return obj.get();			
		} else {
			return null;
		}
	}
}
