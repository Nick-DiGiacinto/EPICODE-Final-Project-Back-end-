//package it.epicode.capstone.configuration;
//
//import java.time.LocalDate;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//import it.epicode.capstone.model.Categoria;
//import it.epicode.capstone.model.Videogioco;
//
//@Configuration
//public class VideogiocoConfig {
//	
//	@Bean
//	@Scope("prototype")
//	public Videogioco creaVideogioco(String titolo, Categoria categoria, String editore, String casaProduzione, LocalDate dataPubblicazione, Double prezzo) {
//		Videogioco v = new Videogioco(titolo, categoria, editore, casaProduzione, dataPubblicazione, prezzo);
//		return v;
//	}
//	
//
//}
