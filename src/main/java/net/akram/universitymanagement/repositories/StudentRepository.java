package net.akram.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akram.universitymanagement.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
}
