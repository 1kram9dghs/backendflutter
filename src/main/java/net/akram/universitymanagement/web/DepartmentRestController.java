package net.akram.universitymanagement.web;

import org.springframework.web.bind.annotation.*;

import net.akram.universitymanagement.entities.Class;
import net.akram.universitymanagement.entities.Department;
import net.akram.universitymanagement.repositories.DepartmentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentRestController {
    private final DepartmentRepository departmentRepository;

    public DepartmentRestController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("/departments/{uuid}")
    public Department getDepartmentById(@PathVariable("uuid") String uuid) {
        if (departmentRepository.findById(uuid).isPresent()) {
            return departmentRepository.findById(uuid).get();
        } else {
            return null;
        }
    }

    @PostMapping("/departments")
    public Department createDepartment(@RequestBody Department newDepartment) {
        return departmentRepository.save(newDepartment);
    }

    @PutMapping("/departments/{uuid}")
    public Department updateDepartment(@PathVariable("uuid") String uuid, @RequestBody Department newDepartment) {
        if (departmentRepository.findById(uuid).isPresent()) {
            Department existingDepartment = departmentRepository.findById(uuid).get();
            existingDepartment.setName(newDepartment.getName());
            existingDepartment.setDescription(newDepartment.getDescription());

            return departmentRepository.save(existingDepartment);
        } else {
            return null;
        }
    }

    @DeleteMapping("/departments/{uuid}")
    public String deleteDepartment(@PathVariable("uuid") String uuid) {
        if (departmentRepository.findById(uuid).isPresent()) {
            departmentRepository.deleteById(uuid);
            return "Department deleted successfully";
        } else {
            return null;
        }
    }

    @GetMapping("/departments/{uuid}/classes")
    public List<Class> getClassesByDepartmentId(@PathVariable("uuid") String uuid) {
        if (departmentRepository.findById(uuid).isPresent()) {
            Department department = departmentRepository.findById(uuid).get();
            return department.getClasses();
        } else {
            return null;
        }
    }
}
