package it.epicode.auth.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.epicode.auth.entity.Categoria;
import it.epicode.auth.entity.Videogioco;

@Configuration
public class VideogiocoConfig {
	
	@Bean
	@Scope("prototype")
	public Videogioco creaVideogioco(String titolo, String immagine, Categoria categoria, String editore, String casaProduzione, LocalDate dataPubblicazione, Double prezzo, String descrizione) {
		Videogioco v = new Videogioco(titolo, immagine, categoria, editore, casaProduzione, dataPubblicazione, prezzo, descrizione);
		return v;
	}
	
//	@Bean
//	@Scope("prototype")
//	public Videogioco creaVideogiocoFake() {
//		Videogioco v = new Videogioco();
//		Faker fake = new Faker(new Locale("it-IT"));
//		
//	}
	

}
