package com.pedidos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedidos.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

    
}
