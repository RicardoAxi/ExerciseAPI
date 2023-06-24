package com.example.demo.commons;

import java.util.Date;
import java.util.List;

public class OrderTO {

	private long id;
    private long clientId;
    private Date timestamp;
    private double total;
    private List<OrderDetailTO> details;
    
    
	public OrderTO() {

	}
	public OrderTO(long id, long clientId, Date timestamp, double total, List<OrderDetailTO> details) {

		this.id = id;
		this.clientId = clientId;
		this.timestamp = timestamp;
		this.total = total;
		this.details = details;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the clientId
	 */
	public long getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	/**
	 * @return the details
	 */
	public List<OrderDetailTO> getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(List<OrderDetailTO> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "OrderTO{" +
				"id=" + id +
				", clientId=" + clientId +
				", timestamp=" + timestamp +
				", total=" + total +
				", details=" + details +
				'}';
	}
}
