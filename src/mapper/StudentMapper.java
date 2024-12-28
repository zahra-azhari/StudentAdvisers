package mapper;

import DTO.StudentDTO;
import Model.Student;

public class StudentMapper {

    public Student studentDtoToStudent(StudentDTO studentDTO){
           // Student student = new Student();
//        student.setFirstName(studentDTO.firstName());
//        student.setLastName(studentDTO.lastName());
//        student.setUserName(studentDTO.userName());
        return new Student(studentDTO.firstName(), studentDTO.lastName(), studentDTO.userName() , null);
    }

    public StudentDTO studentToStudentDTO(Student student){
        return new StudentDTO(student.getFirstName(), student.getLastName(), student.getUserName());
    }

}
