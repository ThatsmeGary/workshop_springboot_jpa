package com.pedidos.course;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedidos.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

    
}
