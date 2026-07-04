package com.noobdevs.tradehub.repository;

import com.noobdevs.tradehub.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
