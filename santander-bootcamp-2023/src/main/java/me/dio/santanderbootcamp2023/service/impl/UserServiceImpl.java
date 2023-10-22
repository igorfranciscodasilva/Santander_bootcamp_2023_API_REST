package me.dio.santanderbootcamp2023.service.impl;

import org.springframework.stereotype.Service;
import me.dio.santanderbootcamp2023.domain.User;
import me.dio.santanderbootcamp2023.repository.UserRepository;
import me.dio.santanderbootcamp2023.service.UserService;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService{
	 private final UserRepository userRepository;

	    public UserServiceImpl(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public User findById(Long id) {
	        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	    }

	    @Override
	    public User create(User userToCreate) {
	        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
	            throw new IllegalArgumentException("This Account number already exists.");
	        }
	        return userRepository.save(userToCreate);
	    }
	}