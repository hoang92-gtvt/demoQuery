package com.example.demo.repository;

import com.example.demo.model.UserInfomation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInformationRepository extends JpaRepository<UserInfomation, Long> {

}
