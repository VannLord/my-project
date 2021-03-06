package service;

import model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    private static Map<Integer,Student> students = new TreeMap<>();
    static {
        students.put(1,new Student(1,"Son","Hamburg","17T3",19,"Male"));
        students.put(2,new Student(2,"Dung","Underground","17T3",20,"Female"));
        students.put(3,new Student(3,"Văn","Quảng Nôm","17T3",19,"Male"));
        students.put(4,new Student(4,"Soang","Đòa Nẽng","17T3",19,"Male"));
        students.put(5,new Student(5,"Hòn","Bình Định","17T3",19,"Male"));
    }
    @Override
    public ArrayList<Student> getStudents() {

        return new ArrayList<>(students.values());
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(),student);
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public void update(Student student) {
        students.put(student.getId(),student);
    }

    @Override
    public void remove(int id) {
        students.remove(id);
    }


}
