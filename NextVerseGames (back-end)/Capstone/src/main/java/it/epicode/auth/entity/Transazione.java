package it.epicode.auth.entity;

import java.time.LocalDate;
import java.util.List;

import it.epicode.auth.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transazioni")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Transazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	LocalDate dataAcquisto;	
	@ManyToOne
	User user;

}
