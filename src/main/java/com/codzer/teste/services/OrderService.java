package com.codzer.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codzer.teste.entities.Order;
import com.codzer.teste.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	// Dependecia 
	private OrderRepository repository;
	
	
	public List<Order> findAll()
	{
		return repository.findAll();
	}
	
	public Order findById(Long id)
	{
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
