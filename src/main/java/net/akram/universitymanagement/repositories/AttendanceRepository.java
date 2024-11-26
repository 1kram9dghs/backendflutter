package net.akram.universitymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akram.universitymanagement.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, String> {
}
