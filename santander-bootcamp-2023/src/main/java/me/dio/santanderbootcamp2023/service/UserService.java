package me.dio.santanderbootcamp2023.service;

import me.dio.santanderbootcamp2023.domain.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
