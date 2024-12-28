
import DTO.*;
import Service.*;
import Service.AdviserServiceImpl;
import Service.StudentService;
import Service.StudentServiceImpl;
import model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        StudentService studentService = new StudentServiceImpl();
        AdviseService adviseService = new AdviserServiceImpl();

        Student student = new Student();
        student.setUserName("mhzd");
        student.setPassword("123456");
        student.setFirstName("morteza");
        student.setLastName("mahdi zadeh");

        StudentDTO studentDTO = studentService.add(student);
        System.out.println(studentDTO);

        System.out.println("get student from database : " + studentService.get("mhzd"));

        System.out.println("get all students from database : " + studentService.getAll());

        System.out.println("get student from database : " + studentService.get("asdfasdf"));

    }
}