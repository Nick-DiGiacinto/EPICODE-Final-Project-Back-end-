package  it.epicode.auth.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import  it.epicode.auth.entity.ERole;
import  it.epicode.auth.entity.Role;
import  it.epicode.auth.entity.User;
import  it.epicode.auth.repository.RoleRepository;
import  it.epicode.auth.repository.UserRepository;
import  it.epicode.auth.service.AuthService;
import  it.epicode.auth.service.AuthServiceImpl;


@Component
public class AuthRunner implements ApplicationRunner {
	
	@Autowired RoleRepository roleRepository;
	@Autowired UserRepository userRepository;
	@Autowired PasswordEncoder passwordEncoder;
	@Autowired AuthService authService;
	
	@Autowired AuthServiceImpl authImp;
	
	private Set<Role> adminRole;
	private Set<Role> moderatorRole;
	private Set<Role> userRole;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		if(roleRepository.findAll().size() == 0) {
			setRoleDefault();			
		}
		
		if(userRepository.findAll().size() == 0) {
			User user = new User();
			user.setUsername("nico");
			user.setPassword(passwordEncoder.encode("qwerty"));
			user.setEmail("moonrise@ex.com");
			user.setName("Nico");
			Role admin = roleRepository.findById(1l).get();			
			user.getRoles().add(admin);
			userRepository.save(user);
		}
	}
	
	private void setRoleDefault() {
		Role admin = new Role();
		admin.setRoleName(ERole.ROLE_ADMIN);
		roleRepository.save(admin);
		
		Role user = new Role();
		user.setRoleName(ERole.ROLE_USER);
		roleRepository.save(user);
		
		Role moderator = new Role();
		moderator.setRoleName(ERole.ROLE_MODERATOR);
		roleRepository.save(moderator);
		
		adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(moderator);
		adminRole.add(user);
		
		moderatorRole = new HashSet<Role>();
		moderatorRole.add(moderator);
		moderatorRole.add(user);
		
		userRole = new HashSet<Role>();
		userRole.add(user);
	}

}
