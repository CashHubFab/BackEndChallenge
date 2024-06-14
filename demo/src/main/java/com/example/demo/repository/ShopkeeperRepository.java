package com.example.demo.repository;

import com.example.demo.domain.Shopkeeper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopkeeperRepository extends JpaRepository<Shopkeeper, Long> {
}

