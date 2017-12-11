package sa45.team9.inventoryApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sa45.team9.inventoryApp.model.Role;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, String>{
	
	@Query("SELECT r FROM Role r where r.role = :Role")
	Role findByRole(@Param("Role") String role);
}
