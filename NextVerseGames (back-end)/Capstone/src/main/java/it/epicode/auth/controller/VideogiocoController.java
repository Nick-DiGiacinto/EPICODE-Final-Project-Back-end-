package it.epicode.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.service.VideogiocoService;
import jakarta.websocket.server.PathParam;

@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/vg")
public class VideogiocoController {
	
	@Autowired VideogiocoService service;
	
	@PostMapping
	public ResponseEntity<?> addVideogioco(Videogioco v){
		try {
			return new ResponseEntity<>(service.addVideogioco(v), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		try {
			return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getSingle(@PathVariable Long id){
		try {
			return new ResponseEntity<>(service.findByID(id), HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
