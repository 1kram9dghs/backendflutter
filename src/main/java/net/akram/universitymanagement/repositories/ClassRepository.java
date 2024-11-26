package net.akram.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akram.universitymanagement.entities.Class;

public interface ClassRepository extends JpaRepository<Class, String> {
}
