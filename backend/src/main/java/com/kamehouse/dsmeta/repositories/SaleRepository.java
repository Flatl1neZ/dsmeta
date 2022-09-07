package com.kamehouse.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamehouse.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
