package com.Validation.Validation.UserRepository;

import com.Validation.Validation.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {
}
