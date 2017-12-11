package sa45.team9.inventoryApp.model;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Employee")
public class Employees {
	
	@OneToMany(targetEntity=Customers.class, mappedBy="employees")
	private List<Customers> customers;
	@OneToMany(targetEntity=Orders.class, mappedBy="employees")
	private List<Orders> orders;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private String employeeID;
	@Basic
	@Column(name = "EmployeeLastName")
	private String employeeLastName;
	@Basic
	@Column(name = "EmployeeFirstName")
	private String employeeFirstName;
	@Basic
	@Column(name = "EmployeeTitle")
	private String employeeTitle;
	@Basic
	@Column(name = "EmployeeBirthDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date employeeBirthDate;
	@Basic
	@Column(name = "EmployeeHireDate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date employeeHireDate;
	@Basic
	@Column(name = "EmployeeAddress")
	private String employeeAddress;
	@Basic
	@Column(name = "EmployeePostalCode")
	private String employeePostalCode;
	@Basic
	@Column(name = "EmployeePhoneNumber")
	private String employeePhoneNumber;
	@Basic
	@Column(name = "EmployeeSpecialization")
	private String employeeSpecialization;
	@Basic
	@Column(name = "EmployeeReportTO")
	private String employeeReportTO;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String employeeID) {
		super();
		this.employeeID = employeeID;
	}
	public Employees(String employeeID, String employeeLastName, String employeeFirstName, String employeeTitle,
			Date employeeBirthDate, Date employeeHireDate, String employeeAddress, String employeePostalCode,
			String employeePhoneNumber, String employeeSpecialization, String employeeReportTO) {
		super();
		this.employeeID = employeeID;
		this.employeeLastName = employeeLastName;
		this.employeeFirstName = employeeFirstName;
		this.employeeTitle = employeeTitle;
		this.employeeBirthDate = employeeBirthDate;
		this.employeeHireDate = employeeHireDate;
		this.employeeAddress = employeeAddress;
		this.employeePostalCode = employeePostalCode;
		this.employeePhoneNumber = employeePhoneNumber;
		this.employeeSpecialization = employeeSpecialization;
		this.employeeReportTO = employeeReportTO;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeTitle() {
		return employeeTitle;
	}
	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;
	}
	public Date getEmployeeBirthDate() {
		return employeeBirthDate;
	}
	public void setEmployeeBirthDate(Date employeeBirthDate) {
		this.employeeBirthDate = employeeBirthDate;
	}
	public Date getEmployeeHireDate() {
		return employeeHireDate;
	}
	public void setEmployeeHireDate(Date employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePostalCode() {
		return employeePostalCode;
	}
	public void setEmployeePostalCode(String employeePostalCode) {
		this.employeePostalCode = employeePostalCode;
	}
	public String getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}
	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}
	public String getEmployeeReportTO() {
		return employeeReportTO;
	}
	public void setEmployeeReportTO(String employeeReportTO) {
		this.employeeReportTO = employeeReportTO;
	}
	public String getEmployeeSpecialization() {
		return employeeSpecialization;
	}
	public void setEmployeeSpecialization(String employeeSpecialization) {
		this.employeeSpecialization = employeeSpecialization;
	}
	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", employeeLastName=" + employeeLastName + ", employeeFirstName="
				+ employeeFirstName + ", employeeTitle=" + employeeTitle + ", employeeBirthDate=" + employeeBirthDate
				+ ", employeeHireDate=" + employeeHireDate + ", employeeAddress=" + employeeAddress
				+ ", employeePostalCode=" + employeePostalCode + ", employeePhoneNumber=" + employeePhoneNumber
				+ ", employeeSpecialization=" + employeeSpecialization + ", employeeReportTO=" + employeeReportTO + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeID == null) ? 0 : employeeID.hashCode());
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
		Employees other = (Employees) obj;
		if (employeeID == null) {
			if (other.employeeID != null)
				return false;
		} else if (!employeeID.equals(other.employeeID))
			return false;
		return true;
	}
	
}