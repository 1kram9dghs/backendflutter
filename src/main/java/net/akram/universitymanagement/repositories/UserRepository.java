package net.akram.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akram.universitymanagement.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmailAndPassword(String email, String password);
}
