package com.gefersonholdorf.projectweb_servicespringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.projectweb_servicespringbootjpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
