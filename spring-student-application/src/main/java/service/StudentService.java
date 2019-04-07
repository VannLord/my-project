package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    ArrayList<Student> getStudents();
    void save(Student student);
    Student findById(int id);
    void update(Student student);
    void remove (int id);

}
