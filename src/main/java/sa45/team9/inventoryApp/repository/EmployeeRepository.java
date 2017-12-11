package sa45.team9.inventoryApp.repository;
import java.util.ArrayList;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sa45.team9.inventoryApp.model.Employees;

public interface EmployeeRepository extends JpaRepository <Employees, String>{
	
	@Query("SELECT e FROM Employees e")
	ArrayList<Employees> findAllEmployees();
	
	@Query("SELECT DISTINCT e.employeeID FROM Employees e")
	ArrayList<String> findAllEmployeeIDs();
	
	@Query("SELECT e FROM Employees e where e.employeeID = :Id")
	Employees findEmployeeById(@Param("Id") String id);
}
