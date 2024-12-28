package DB;

import Model.Adviser;
import Model.Student;
import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB {
    private final static List<Student> students = new ArrayList<>();
    private static final ArrayList<Adviser> advisers = new ArrayList<>();

    //--------------------------------------------------------------------------Student
    public static Student addStudent(Student student) {

        boolean flag = false;
        for (Student s : students) {
            if (s.getUserName().equals(student.getUserName())) {
                flag = true;
                System.out.println("student was duplicated ");
                break;
            }
        }
        if (!flag) {
            students.add(student);
            System.out.println("student has been added : " + student.getUserName());
            return student;
        }
        return null;
    }

    public static void deleteStudent(String userName) {

        for (Student s : students) {
            if (s.getUserName().equals(userName)) {
                students.remove(s);
                System.out.println("student has been deleted : " + s.getUserName());
            }
        }
        return;
    }

    public static List<Student> getALLStudents() {
        return new ArrayList<>(students);
    }
    public static Student getStudents(String userName) {
        for(Student s:students){
            if(s.getUserName().equals(userName)){
                System.out.println("student has been founded.");
                return s;
            }
        }
        return null;

    }
    public static Student updateStudent(Student student) {

        for (Student s : students) {
            if (s.getUserName().equals(student.getUserName())) {
                s.setUserName(student.getUserName());
                s.setPassword(student.getPassword());
                s.setFirstName(student.getFirstName());
                s.setLastName(student.getLastName());
                System.out.println("student has been updated : " + s.getUserName());
                return student;
            }
        }
        return null;

    }


    //------------------------------------------------------------------------------Adviser
    public static Adviser addAdviser(Adviser adviser) {
        boolean flag = false;
        for (Adviser a : advisers) {
            if (a.getUserName().equals(adviser.getUserName())) {
                flag = true;
                System.out.println("adviser was duplicated ");
                break;
            }
        }
        if (!flag) {
            advisers.add(adviser);
            System.out.println("adviser has been added : " + adviser.getUserName());
            return adviser;

        }
        return adviser;
    }
    public static void deleteAdviser(String userName) {
        for (Adviser a : advisers) {
            if (a.getUserName().equals(userName)) {
                advisers.remove(a);
                System.out.println("adviser has been deleted : " + a.getUserName());
            }
        }
        return;

    }
    public static List<Adviser> getALLAdvisers() {
        return new ArrayList<>(advisers);
    }
    public static Adviser getAdviser(String userName) {
        for(Adviser a:advisers){
            if(a.getUserName().equals(userName)){
                System.out.println("adviser has been founded.");
                return a;
            }
        }
        return null;

    }

    public static Adviser updateAdviser(Adviser adviser) {
        for(Adviser a:advisers){
            if(adviser.getUserName().equals(a.getUserName())){
                a.setUserName(adviser.getUserName());
                a.setPassword(adviser.getPassword());
                a.setFirstName(adviser.getFirstName());
                a.setLastName(adviser.getLastName());
                System.out.println("adviser has been updated : " + a.getUserName());
                return adviser;

            }

        }
        return null;
    }


}


