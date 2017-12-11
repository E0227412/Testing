package sa45.team9.inventoryApp.model;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Customers")
public class Customers {
	
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employees employees;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private String customerID;
	@Basic
	@Column(name = "CustomerServiceEmployeeID")
	private String customerServiceEmployeeID;
	@Basic
	@Column(name = "CustomerName")
	private String customerName;
	@Basic
	@Column(name = "CustomerContactTite")
	private String customerContactTite;
	@Basic
	@Column(name = "CustomerAddress")
	private String customerAddress;
	@Basic
	@Column(name = "CustomerPostalCode")
	private String customerPostalCode;
	@Basic
	@Column(name = "CustomerPhoneNumber")
	private String customerPhoneNumber;
	@Basic
	@Column(name = "CustomerEmailAddress")
	private String customerEmailAddress;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(String customerID) {
		super();
		this.customerID = customerID;
	}
	
	public Customers(Employees employees, String customerID, String customerServiceEmployeeID, String customerName,
			String customerContactTite, String customerAddress, String customerPostalCode, String customerPhoneNumber,
			String customerEmailAddress) {
		super();
		this.customerID = customerID;
		this.customerServiceEmployeeID = customerServiceEmployeeID;
		this.customerName = customerName;
		this.customerContactTite = customerContactTite;
		this.customerAddress = customerAddress;
		this.customerPostalCode = customerPostalCode;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContactTite() {
		return customerContactTite;
	}
	public void setCustomerContactTite(String customerContactTite) {
		this.customerContactTite = customerContactTite;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPostalCode() {
		return customerPostalCode;
	}
	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	
	public String getCustomerServiceEmployeeID() {
		return customerServiceEmployeeID;
	}
	public void setCustomerServiceEmployeeID(String customerServiceEmployeeID) {
		this.customerServiceEmployeeID = customerServiceEmployeeID;
	}
	
	@Override
	public String toString() {
		return "Customers [customerID=" + customerID + ", customerServiceEmployeeID=" + customerServiceEmployeeID
				+ ", customerName=" + customerName + ", customerContactTite=" + customerContactTite
				+ ", customerAddress=" + customerAddress + ", customerPostalCode=" + customerPostalCode
				+ ", customerPhoneNumber=" + customerPhoneNumber + ", customerEmailAddress=" + customerEmailAddress
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
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
		Customers other = (Customers) obj;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		return true;
	}
	
}
