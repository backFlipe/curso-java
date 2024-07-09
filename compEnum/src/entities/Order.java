package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aplication.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private Client client;
	private Product product;
	private OrderItem orderItem;
	
	List <OrderItem> list = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		list.add(item);
	}
	
	public void RemoveItem(OrderItem item) {
		list.remove(item);
	}

	public Double total() {
		double sum = 0;
		for (OrderItem item : list) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Sumary: \n");
		sb.append("Order moment: " + moment + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client);
		sb.append("Order Items: \n");
		for (OrderItem item : list) {
			sb.append(item + "\n");
		}
		sb.append("Total: " + total());
		return sb.toString();
	}
}
