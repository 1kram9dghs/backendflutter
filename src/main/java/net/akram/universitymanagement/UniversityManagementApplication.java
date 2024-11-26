package net.akram.universitymanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.akram.universitymanagement.entities.Class;
import net.akram.universitymanagement.entities.Department;
import net.akram.universitymanagement.entities.Student;
import net.akram.universitymanagement.repositories.ClassRepository;
import net.akram.universitymanagement.repositories.DepartmentRepository;
import net.akram.universitymanagement.repositories.StudentRepository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class UniversityManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityManagementApplication.class, args);
	}
}
