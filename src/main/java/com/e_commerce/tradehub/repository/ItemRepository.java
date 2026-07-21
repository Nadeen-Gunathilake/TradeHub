package com.e_commerce.tradehub.repository;

import com.e_commerce.tradehub.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
