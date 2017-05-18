/**
 * 
 */
package com.hertz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hertz.entity.Orders;
import com.hertz.repository.OrdersRepository;

/**
 * @author Subba Rao Ch
 *
 */
@RestController
@RequestMapping("/order")
public class OrdersController {
	
	@Autowired
	OrdersRepository ordersRepository;
	
	@RequestMapping("/all")
	public List<Orders> listOrders(){
		return ordersRepository.findAll();
	}

	@RequestMapping("/{id}")
	public Orders getById(@PathVariable Integer id){
		return ordersRepository.findOne(id);
	}
	
	@RequestMapping("/customerId/{customerId}")
	public List<Orders>  getByCustomerId(@PathVariable Integer customerId){
		return ordersRepository.findByCustomerId(customerId);
	}
}
