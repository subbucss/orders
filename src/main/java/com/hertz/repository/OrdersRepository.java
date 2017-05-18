/**
 * 
 */
package com.hertz.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hertz.entity.Orders;

/**
 * @author Subba Rao Ch
 *
 */
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	public List<Orders> findByCustomerId(Integer customerId);

}
