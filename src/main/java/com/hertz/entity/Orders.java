/**
 * 
 */
package com.hertz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Subba Rao Ch
 *
 */
@Entity
@Table(name = "ORDERS", uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ORD_ID_SEQ")
	@SequenceGenerator(name = "ORD_ID_SEQ", sequenceName = "ORD_ID_SEQ")
	@Column(name = "ID", length = 11)
	private Integer id;
	
	@Column(name = "ORDER_NAME", length = 300)
	private String orderName;
	
	@Column(name = "PRICE",columnDefinition = "FLOAT(7,2)")
	private Float price;
	
	@Column(name = "CUSTOMER_ID", length = 11)
	private Integer customerId;
	
	@Column(name = "CARD_ID", length = 11)
	private Integer cardId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	
	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
}
