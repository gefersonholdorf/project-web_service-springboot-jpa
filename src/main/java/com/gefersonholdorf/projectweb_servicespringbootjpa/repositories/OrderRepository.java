package com.gefersonholdorf.projectweb_servicespringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.projectweb_servicespringbootjpa.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
