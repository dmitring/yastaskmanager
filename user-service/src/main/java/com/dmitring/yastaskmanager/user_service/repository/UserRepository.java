package com.dmitring.yastaskmanager.user_service.repository;

import com.dmitring.yastaskmanager.user_service.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmail(String email);
}