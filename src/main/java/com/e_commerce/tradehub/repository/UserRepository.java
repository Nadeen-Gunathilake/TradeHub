package com.e_commerce.tradehub.repository;

import com.e_commerce.tradehub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
