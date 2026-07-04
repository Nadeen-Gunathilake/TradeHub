package com.noobdevs.tradehub.repository;

import com.noobdevs.tradehub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
