package sa45.team9.inventoryApp.model;

import java.io.Serializable;


public class CompositeKey implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	private String orderID;	
	private String partNumber;
	
	public CompositeKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompositeKey(String orderID, String partNumber) {
		super();
		this.orderID = orderID;
		this.partNumber = partNumber;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((partNumber == null) ? 0 : partNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeKey other = (CompositeKey) obj;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (partNumber == null) {
			if (other.partNumber != null)
				return false;
		} else if (!partNumber.equals(other.partNumber))
			return false;
		return true;
	}	
}
