package sa45.team9.inventoryApp.model;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Parts")
public class Parts {
    @OneToMany(targetEntity=OrderDetails.class, mappedBy="parts")
    private List<OrderDetails> orderDetails;
    @ManyToOne
    @JoinColumn(name="SupplierID")
    private Suppliers suppliers;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PartNumber")
    private String partNumber;
    @Basic
    @Column(name = "PartName")
    private String partName;
    @Basic
    @Column(name = "PartUnitPrice")
    private float partUnitPrice;
    @Basic
    @Column(name = "PartDescription")
    private String partDescription;
    @Basic
    @Column(name = "PartColor")
    private String partColor;
    @Basic
    @Column(name = "PartDimension")
    private String partDimension;
    @Basic
    @Column(name = "PartSupplierID")
    private String partSupplierID;
    @Basic
    @Column(name = "PartManufacturer")
    private String partManufacturer;
    @Basic
    @Column(name = "PartQuantityPerUnit")
    private int partQuantityPerUnit;
    @Basic
    @Column(name = "PartUnitInStock")
    private int partUnitInStock;
    @Basic
    @Column(name = "PartUnitOnOrder")
    private int partUnitOnOrder;
    @Basic
    @Column(name = "PartReorderLevel")
    private int partReorderLevel;
    @Basic
    @Column(name = "PartMinimumReorderQuantity")
    private int partMinimumReorderQuantity;
    @Basic
    @Column(name = "PartShelfLocation")
    private String partShelfLocation;
    @Basic
    @Column(name = "PartDiscontinued")
    private String partDiscontinued;
    public Parts() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Parts(String partName) {
        super();
        this.partName = partName;
    }
    public Parts(List<OrderDetails> orderDetails, Suppliers suppliers, String partNumber, String partName,
            float partUnitPrice, String partDescription, String partColor, String partDimension, String partSupplierID,
            String partManufacturer, int partQuantityPerUnit, int partUnitInStock, int partUnitOnOrder,
            int partReorderLevel, int partMinimumReorderQuantity, String partShelfLocation, String partDiscontinued) {
        super();
        this.orderDetails = orderDetails;
        this.suppliers = suppliers;
        this.partNumber = partNumber;
        this.partName = partName;
        this.partUnitPrice = partUnitPrice;
        this.partDescription = partDescription;
        this.partColor = partColor;
        this.partDimension = partDimension;
        this.partSupplierID = partSupplierID;
        this.partManufacturer = partManufacturer;
        this.partQuantityPerUnit = partQuantityPerUnit;
        this.partUnitInStock = partUnitInStock;
        this.partUnitOnOrder = partUnitOnOrder;
        this.partReorderLevel = partReorderLevel;
        this.partMinimumReorderQuantity = partMinimumReorderQuantity;
        this.partShelfLocation = partShelfLocation;
        this.partDiscontinued = partDiscontinued;
    }
    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }
    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
    public Suppliers getSuppliers() {
        return suppliers;
    }
    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartName() {
        return partName;
    }
    public void setPartName(String partName) {
        this.partName = partName;
    }
    public float getPartUnitPrice() {
        return partUnitPrice;
    }
    public void setPartUnitPrice(float partUnitPrice) {
        this.partUnitPrice = partUnitPrice;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public String getPartColor() {
        return partColor;
    }
    public void setPartColor(String partColor) {
        this.partColor = partColor;
    }
    public String getPartDimension() {
        return partDimension;
    }
    public void setPartDimension(String partDimension) {
        this.partDimension = partDimension;
    }
    public String getPartSupplierID() {
        return partSupplierID;
    }
    public void setPartSupplierID(String partSupplierID) {
        this.partSupplierID = partSupplierID;
    }
    public String getPartManufacturer() {
        return partManufacturer;
    }
    public void setPartManufacturer(String partManufacturer) {
        this.partManufacturer = partManufacturer;
    }
    public int getPartQuantityPerUnit() {
        return partQuantityPerUnit;
    }
    public void setPartQuantityPerUnit(int partQuantityPerUnit) {
        this.partQuantityPerUnit = partQuantityPerUnit;
    }
    public int getPartUnitInStock() {
        return partUnitInStock;
    }
    public void setPartUnitInStock(int partUnitInStock) {
        this.partUnitInStock = partUnitInStock;
    }
    public int getPartUnitOnOrder() {
        return partUnitOnOrder;
    }
    public void setPartUnitOnOrder(int partUnitOnOrder) {
        this.partUnitOnOrder = partUnitOnOrder;
    }
    public int getPartReorderLevel() {
        return partReorderLevel;
    }
    public void setPartReorderLevel(int partReorderLevel) {
        this.partReorderLevel = partReorderLevel;
    }
    public int getPartMinimumReorderQuantity() {
        return partMinimumReorderQuantity;
    }
    public void setPartMinimumReorderQuantity(int partMinimumReorderQuantity) {
        this.partMinimumReorderQuantity = partMinimumReorderQuantity;
    }
    public String getPartShelfLocation() {
        return partShelfLocation;
    }
    public void setPartShelfLocation(String partShelfLocation) {
        this.partShelfLocation = partShelfLocation;
    }
    public String getPartDiscontinued() {
        return partDiscontinued;
    }
    public void setPartDiscontinued(String partDiscontinued) {
        this.partDiscontinued = partDiscontinued;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        Parts other = (Parts) obj;
        if (partNumber == null) {
            if (other.partNumber != null)
                return false;
        } else if (!partNumber.equals(other.partNumber))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Parts [orderDetails=" + orderDetails + ", suppliers=" + suppliers + ", partNumber=" + partNumber
                + ", partName=" + partName + ", partUnitPrice=" + partUnitPrice + ", partDescription=" + partDescription
                + ", partColor=" + partColor + ", partDimension=" + partDimension + ", partSupplierID=" + partSupplierID
                + ", partManufacturer=" + partManufacturer + ", partQuantityPerUnit=" + partQuantityPerUnit
                + ", partUnitInStock=" + partUnitInStock + ", partUnitOnOrder=" + partUnitOnOrder
                + ", partReorderLevel=" + partReorderLevel + ", partMinimumReorderQuantity="
                + partMinimumReorderQuantity + ", partShelfLocation=" + partShelfLocation + ", partDiscontinued="
                + partDiscontinued + "]";
    }
}