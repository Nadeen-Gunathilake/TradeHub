package com.e_commerce.tradehub.repository;

import com.e_commerce.tradehub.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
