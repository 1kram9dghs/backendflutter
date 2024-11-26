package net.akram.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akram.universitymanagement.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
