package com.gabrielbertti.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielbertti.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
