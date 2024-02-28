package com.gefersonholdorf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.projectweb_servicespringbootjpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
