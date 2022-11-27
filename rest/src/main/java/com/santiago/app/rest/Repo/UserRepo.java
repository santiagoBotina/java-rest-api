package com.santiago.app.rest.Repo;

import com.santiago.app.rest.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
