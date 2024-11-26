package net.akram.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akram.universitymanagement.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
