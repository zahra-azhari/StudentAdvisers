package Repo;

import DB.InMemoryDB;
import Model.Student;

import java.util.List;

public class StudentRepImpl implements StudentRepo {

    @Override
    public Student save(Student student) {
        return InMemoryDB.addStudent(student);
    }

    @Override
    public void remove(String userName) {
        InMemoryDB.deleteStudent(userName);
    }

    @Override
    public Student update(Student student) {
        return InMemoryDB.updateStudent(student);
    }

    @Override
    public Student get(String userName) {
        return InMemoryDB.getStudents(userName);
    }

    @Override
    public List<Student> getAll() {
        return InMemoryDB.getALLStudents();
    }
}
