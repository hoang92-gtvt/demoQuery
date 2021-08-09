package com.example.demo.repository.relationRepo;

import com.example.demo.model.relationClass.User_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Role_Repo extends JpaRepository<User_Role,Long> {
}
