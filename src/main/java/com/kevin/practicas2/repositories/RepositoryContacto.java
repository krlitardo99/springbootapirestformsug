package com.kevin.practicas2.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kevin.practicas2.models.Contacto;

@Repository
public interface RepositoryContacto extends JpaRepository<Contacto, Long>{

    
}