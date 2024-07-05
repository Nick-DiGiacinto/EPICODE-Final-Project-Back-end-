package it.epicode.auth.service;

import it.epicode.auth.payload.LoginDto;
import it.epicode.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
