//package sa45.team9.inventoryApp.model;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//@Entity
//@Table(name="PartsDetails")
//public class PartsDetails {
//	
//	@OneToOne(mappedBy="partDetails")
//	private Parts parts;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "PartNumber")
//	private String partNumber;
//	@Basic
//	@Column(name = "PartUnitPrice")
//	private int partUnitPrice;
//	@Basic
//	@Column(name = "PartDescription")
//	private String partDescription;
//	@Basic
//	@Column(name = "PartColor")
//	private String partColor;
//	@Basic
//	@Column(name = "PartDimension")
//	private String partDimension;
//	public PartsDetails() {
//		super();
//	}
//	public PartsDetails(String partNumber) {
//		super();
//		this.partNumber = partNumber;
//	}
//	public PartsDetails(String partNumber, int partUnitPrice, String partDescription, String partColor,
//			String partDimension) {
//		super();
//		this.partNumber = partNumber;
//		this.partUnitPrice = partUnitPrice;
//		this.partDescription = partDescription;
//		this.partColor = partColor;
//		this.partDimension = partDimension;
//	}
//	public String getPartNumber() {
//		return partNumber;
//	}
//	public void setPartNumber(String partNumber) {
//		this.partNumber = partNumber;
//	}
//	public int getPartUnitPrice() {
//		return partUnitPrice;
//	}
//	public void setPartUnitPrice(int partUnitPrice) {
//		this.partUnitPrice = partUnitPrice;
//	}
//	public String getPartDescription() {
//		return partDescription;
//	}
//	public void setPartDescription(String partDescription) {
//		this.partDescription = partDescription;
//	}
//	public String getPartColor() {
//		return partColor;
//	}
//	public void setPartColor(String parColor) {
//		this.partColor = parColor;
//	}
//	public String getPartDimension() {
//		return partDimension;
//	}
//	public void setPartDimension(String partDimension) {
//		this.partDimension = partDimension;
//	}
//	@Override
//	public String toString() {
//		return "PartsDetails [partNumber=" + partNumber + ", partUnitPrice=" + partUnitPrice + ", partDescription="
//				+ partDescription + ", parColor=" + partColor + ", partDimension=" + partDimension + "]";
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((partNumber == null) ? 0 : partNumber.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		PartsDetails other = (PartsDetails) obj;
//		if (partNumber == null) {
//			if (other.partNumber != null)
//				return false;
//		} else if (!partNumber.equals(other.partNumber))
//			return false;
//		return true;
//	}
//	
//}