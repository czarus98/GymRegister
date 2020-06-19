package com.GymRegister.Services;

import com.GymRegister.Dto.UserRegistrationDto;
import com.GymRegister.Models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);
    User save(UserRegistrationDto userRegistrationDto);
}
