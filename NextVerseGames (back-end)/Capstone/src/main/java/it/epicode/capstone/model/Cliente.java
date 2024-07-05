//package it.epicode.capstone.model;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "clienti")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Builder
//public class Cliente {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String username;
//	private String password;
//	@Column(unique = true)
//	private String email;
//	@ManyToMany
//	List<Videogioco> libreriaPersonale;
//	@OneToOne(cascade = CascadeType.ALL)
//	Carrello carrello;
//	
//	
//	public Cliente(String username, String password, String email) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.email = email;
//	}
//	
//	
//
//}
