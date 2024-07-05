//package it.epicode.capstone.configuration;
//
//import java.util.List;
//import java.util.Locale;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//import com.github.javafaker.Faker;
//
//import it.epicode.auth.entity.User;
//import it.epicode.capstone.model.Videogioco;
//
//@Configuration
//public class UserConfig {
//
//	@Bean(name = "fake")
//	@Scope("prototype")
//	public User creaClienteFake() {
//		User c = new User();
//		Faker fake = new Faker(new Locale("it-IT"));
////		c.builder().username(fake.name().username()).password("qwerty")
////				.email(c.getUsername() + "@example.com").build();
//		c.setUsername(fake.name().username());
//		c.setPassword("qwerty");
//		c.setEmail(c.getUsername() + "@example.com");
//
//		return c;
//
//	}
//
//	@Bean(name = "void")
//	@Scope("prototype")
//	public User creaCliente() {
//		User c = new User();
//		return c;
//	}
//
//	@Bean(name = "custom")
//	@Scope("prototype")
//	public User creaClienteCustom(String username, String password, String email) {
//		User c = new User(username, password, email);
//		return c;
//	}
//
//}
