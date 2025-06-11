package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // Constructor injection for the StudentService
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Endpoint to retrieve all students
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // Endpoint to register a new student
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    // Endpoint to delete a student by ID
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    // Endpoint to update an existing student's details
    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam (required = false) String name,
            @RequestParam(required = false) String email)
            {
        studentService.updateStudent(studentId,name,email);
    }
}
