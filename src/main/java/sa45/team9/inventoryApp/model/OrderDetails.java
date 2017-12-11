package sa45.team9.inventoryApp.model;
import javax.persistence.*;



@Entity
@Table(name="OrderDeatails")
@IdClass(CompositeKey.class)
public class OrderDetails {
	
	@ManyToOne
	@JoinColumn(name="OrderID")
	private Orders orders;
	
	@ManyToOne
	@JoinColumn(name="PartNumber")
	private Parts parts;
	
//	@EmbeddedId
//	private CompositeKey key;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderID", insertable = false, updatable = false)
	private String orderID;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PartNumber", insertable = false, updatable = false)
	private String partNumber;
	@Basic
	@Column(name = "PartUnitPrice")
	private double partUnitPrice;
	@Basic
	@Column(name = "PartQuantity")
	private int partQuantity;
	@Basic
	@Column(name = "PartDiscount")
	private double partDiscount;
	@Basic
	@Column(name = "ReasonDescription")
	private String reasonDescription;
	@Basic
	@Column(name = "Reason")
	private String reason;
	
	public OrderDetails() {
		super();
	}

	public OrderDetails(String orderID, String partNumber) {
		super();
		this.orderID = orderID;
		this.partNumber = partNumber;
	}

	public OrderDetails(String orderID, String partNumber, double partUnitPrice, int partQuantity, double partDiscount,
			String reasonDescription, String reason) {
		super();
		this.orderID = orderID;
		this.partNumber = partNumber;
		this.partUnitPrice = partUnitPrice;
		this.partQuantity = partQuantity;
		this.partDiscount = partDiscount;
		this.reasonDescription = reasonDescription;
		this.reason = reason;
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

	public double getPartUnitPrice() {
		return partUnitPrice;
	}

	public void setPartUnitPrice(double partUnitPrice) {
		this.partUnitPrice = partUnitPrice;
	}

	public int getPartQuantity() {
		return partQuantity;
	}

	public void setPartQuantity(int partQuantity) {
		this.partQuantity = partQuantity;
	}

	public double getPartDiscount() {
		return partDiscount;
	}

	public void setPartDiscount(double partDiscount) {
		this.partDiscount = partDiscount;
	}

	public String getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderID=" + orderID + ", partNumber=" + partNumber + ", partUnitPrice=" + partUnitPrice
				+ ", partQuantity=" + partQuantity + ", partDiscount=" + partDiscount + ", reasonDescription="
				+ reasonDescription + ", reason=" + reason + "]";
	}

	
}
