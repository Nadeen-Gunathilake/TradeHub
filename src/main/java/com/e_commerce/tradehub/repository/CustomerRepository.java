package com.e_commerce.tradehub.repository;

import com.e_commerce.tradehub.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
