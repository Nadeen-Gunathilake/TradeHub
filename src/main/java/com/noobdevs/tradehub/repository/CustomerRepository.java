package com.noobdevs.tradehub.repository;

import com.noobdevs.tradehub.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
