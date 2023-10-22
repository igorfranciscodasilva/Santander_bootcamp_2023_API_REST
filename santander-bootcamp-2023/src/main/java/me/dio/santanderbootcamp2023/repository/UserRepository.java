package me.dio.santanderbootcamp2023.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import me.dio.santanderbootcamp2023.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByAccountNumber(String accountNumber);
	}
