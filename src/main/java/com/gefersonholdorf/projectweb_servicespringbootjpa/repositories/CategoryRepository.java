package com.gefersonholdorf.projectweb_servicespringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.projectweb_servicespringbootjpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
