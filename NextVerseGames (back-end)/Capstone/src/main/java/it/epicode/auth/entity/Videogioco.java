package it.epicode.auth.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "videogiochi")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Videogioco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titolo;
	private String immagine;
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	private String editore;
	private String casaProduzione;
	LocalDate dataPubblicazione;
	Double prezzo;
	@Column(length = 10000)
	String descrizione;
		
	public Videogioco(String titolo, String immagine, Categoria categoria, String editore, String casaProduzione,
			LocalDate dataPubblicazione, Double prezzo, String descrizione) {
		super();
		this.titolo = titolo;
		this.immagine = immagine;
		this.categoria = categoria;
		this.editore = editore;
		this.casaProduzione = casaProduzione;
		this.dataPubblicazione = dataPubblicazione;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}
	
	

}
