package com.godcoder.mytome.repository;

import com.godcoder.mytome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
