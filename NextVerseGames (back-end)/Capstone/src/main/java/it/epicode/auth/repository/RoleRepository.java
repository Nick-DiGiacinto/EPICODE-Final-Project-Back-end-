package  it.epicode.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.epicode.auth.entity.ERole;
import it.epicode.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
