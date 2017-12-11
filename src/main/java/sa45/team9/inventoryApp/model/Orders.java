package sa45.team9.inventoryApp.model;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Orders")
public class Orders {
	
	@OneToMany(targetEntity=OrderDetails.class, mappedBy="orders")
	private List<OrderDetails> orderDetails;
		
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employees employees;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID")
	private String orderID;
	@Basic
	@Column(name = "OrderEmployeeID")
	private String orderEmployeeID;
	@Basic
	@Column(name = "OrderSupplierID")
	private String orderSupplierID;
	@Basic
	@Column(name = "OrderDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderDate;
	@Basic
	@Column(name = "OrderRequiredDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderRequiredDate;
	@Basic
	@Column(name = "OrderArrivedDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderArrivedDate;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(String orderID) {
		super();
		this.orderID = orderID;
	}
	public Orders(String orderID, String orderEmployeeID, String orderSupplierID, Date orderDate, Date orderRequiredDate,
			Date orderArrivedDate) {
		super();
		this.orderID = orderID;
		this.orderEmployeeID = orderEmployeeID;
		this.orderSupplierID = orderSupplierID;
		this.orderDate = orderDate;
		this.orderRequiredDate = orderRequiredDate;
		this.orderArrivedDate = orderArrivedDate;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderEmployeeID() {
		return orderEmployeeID;
	}
	public void setOrderEmployeeID(String orderEmployeeID) {
		this.orderEmployeeID = orderEmployeeID;
	}
	public String getOrderSupplierID() {
		return orderSupplierID;
	}
	public void setOrderSupplierID(String orderSupplierID) {
		this.orderSupplierID = orderSupplierID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderRequiredDate() {
		return orderRequiredDate;
	}
	public void setOrderRequiredDate(Date orderRequiredDate) {
		this.orderRequiredDate = orderRequiredDate;
	}
	public Date getOrderArrivedDate() {
		return orderArrivedDate;
	}
	public void setOrderArrivedDate(Date orderArrivedDate) {
		this.orderArrivedDate = orderArrivedDate;
	}
	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", orderEmployeeID=" + orderEmployeeID + ", orderSupplierID="
				+ orderSupplierID + ", orderDate=" + orderDate + ", orderRequiredDate=" + orderRequiredDate
				+ ", orderArrivedDate=" + orderArrivedDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
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
		Orders other = (Orders) obj;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		return true;
	}
	
}
