package com.dailycodebuffer.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.dailycodebuffer.department.entity.User_;

@Repository
public interface UserRepository extends JpaRepository<User_,Long>{

	User_ findByUserId(Long userId);

}
