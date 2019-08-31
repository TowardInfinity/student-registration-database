package in.toin.studentregistration.studentregistrationdatabase.repository;

import in.toin.studentregistration.studentregistrationdatabase.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}