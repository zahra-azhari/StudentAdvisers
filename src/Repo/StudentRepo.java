package Repo;

import model.Student;

import java.util.List;

public interface StudentRepo {

    Student save(Student student);
    void remove(String userName);
    Student update(Student student);
    Student get(String userName);
    List<Student> getAll();
}
