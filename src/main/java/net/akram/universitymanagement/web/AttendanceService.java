package net.akram.universitymanagement.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.akram.universitymanagement.entities.Attendance;
import net.akram.universitymanagement.repositories.AttendanceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    public Optional<Attendance> getAttendanceById(String id) {
        return attendanceRepository.findById(id);
    }

    public Attendance updateAttendance(String id, Attendance attendance) {
        Attendance existingAttendance = attendanceRepository.findById(id).get();
        existingAttendance.setStudent(attendance.getStudent());
        existingAttendance.setSubject(attendance.getSubject());
        existingAttendance.setDate(attendance.getDate());
        existingAttendance.setPresent(attendance.isPresent());
        return attendanceRepository.save(existingAttendance);
    }

    public void deleteAttendance(String id) {
        attendanceRepository.deleteById(id);
    }
}

