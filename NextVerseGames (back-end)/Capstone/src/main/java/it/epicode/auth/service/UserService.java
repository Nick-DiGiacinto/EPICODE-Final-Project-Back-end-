package it.epicode.auth.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.metamodel.mapping.EntityAssociationMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.auth.entity.User;
import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.repository.UserRepository;
import it.epicode.auth.repository.VideogiocoRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired UserRepository userRepo;
	@Autowired VideogiocoRepository videogiocoRepo;
	
	public List<Videogioco> addVideogiochiToList(List<Videogioco> videogiochi, Long id){
		User u = userRepo.findById(id).get();
		u.getLibreriaPersonale().addAll(videogiochi);
		userRepo.save(u);
		return videogiochi;		
	}
	
	public Videogioco addVideogiocoSingolo(Videogioco vg, Long id){
		User u = userRepo.findById(id).get();
		u.getLibreriaPersonale().add(vg);
		userRepo.save(u);
		return vg;		
	}
	
	public List<Videogioco> giftVideogiochiToList(List<Videogioco> videogiochi, String username){
		User u = userRepo.findByUsername(username);
		List <Videogioco> libreria = u.getLibreriaPersonale();
		for(Videogioco videogioco : videogiochi) {
			if(!libreria.contains(videogioco)) {
				libreria.add(videogioco);
			} else throw new EntityExistsException("Gioco già presente in libreria");
		}
//		libreria.addAll(videogiochi);
		userRepo.save(u);
		return videogiochi;		
	}

	
	public User getUsernameFromId(Long id){
	       return  userRepo.findById(id).get();
	    }
	
	public List<User> findAll(){
		if(userRepo.findAll().size() > 0) {
			return userRepo.findAll();
		} else {
			System.out.println("Lista utenti vuota!");
		}
		return null;
	}
	
	public User findByUsername(String username) {
		if(!userRepo.existsByUsername(username)) {
			throw new EntityNotFoundException("Nessun utente con questo username");
			} 				
			 return userRepo.findByUsername(username);
			}
	
	
	public List<Videogioco> getLibraryById(Long id){			
		User u = userRepo.findById(id).get();		
		return u.getLibreriaPersonale();
		
	}
	
	public User editUser(User user) {
//		User user = userRepo.findById(user.getId()).get();
		if(!userRepo.existsById(user.getId())) {
			throw new EntityNotFoundException("Nessun utente trovato");
		}
		return userRepo.save(user);
		
	}
	
	}

