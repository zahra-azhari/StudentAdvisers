package Service;

import DTO.StudentDTO;
import model.Student;
import Repo.StudentRepImpl;
import Repo.StudentRepo;
import mapper.StudentMapper;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    public StudentServiceImpl() {
        this.studentRepo = new StudentRepImpl();
        this.studentMapper = new StudentMapper();
    }

    @Override
    public StudentDTO add(Student student) {
        Student result = studentRepo.save(student);
        return studentMapper.studentToStudentDTO(result);
    }

    @Override
    public void delete(String userName) {
        studentRepo.remove(userName);
    }

    @Override
    public StudentDTO edit(Student student) {
        Student result = studentRepo.update(student);
        return studentMapper.studentToStudentDTO(result);
    }

    @Override
    public StudentDTO get(String userName) {
        Student result = studentRepo.get(userName);
        if (result == null) {
            return null;
        }
        return studentMapper.studentToStudentDTO(result);
    }



    @Override
    public List<StudentDTO> getAll(){
        List<Student> result = studentRepo.getAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : result) {
            studentDTOS.add(studentMapper.studentToStudentDTO(student));
        }
        return studentDTOS;
    }

}
