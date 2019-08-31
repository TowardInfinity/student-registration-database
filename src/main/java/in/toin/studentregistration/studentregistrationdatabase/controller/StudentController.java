package in.toin.studentregistration.studentregistrationdatabase.controller;

import in.toin.studentregistration.studentregistrationdatabase.entity.Student;
import in.toin.studentregistration.studentregistrationdatabase.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;
    
    // insert new Student into database
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }
    
    // fetch all student list from database
    @GetMapping("/all")
    public Iterable<Student> allStudent() {
        return repository.findAll();
    }
    
    // fetch specific student by their ID
    @GetMapping("/{id}")
    public Optional<Student> studentById(@PathVariable("id") int id) {
        return repository.findById(id);
    }
    
    // update existing student
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return repository.save(student);
    }
    
    // delete student from database
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}