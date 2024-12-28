package Service;

import DTO.StudentDTO;
import model.Student;

import java.util.List;

public interface StudentService {

    StudentDTO add(Student student);
    void delete(String userName);
    StudentDTO edit(Student student);
    StudentDTO get(String userName);


    List<StudentDTO> getAll();
}

