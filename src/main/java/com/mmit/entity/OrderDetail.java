package com.mmit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail  implements Serializable {
	
	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders order;
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
	private int subQty;
	private int subPrice;

	
	private static final long serialVersionUID = 1L;
	

}
