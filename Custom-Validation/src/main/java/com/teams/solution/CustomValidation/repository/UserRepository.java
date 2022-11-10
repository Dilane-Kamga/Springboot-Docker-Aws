package com.teams.solution.CustomValidation.repository;

import com.teams.solution.CustomValidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
