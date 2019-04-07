package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @GetMapping("/list")
    public String list ( Model model){
        List<Student> students = studentService.getStudents();
        model.addAttribute("students",students);
        return "list";
    }
    @GetMapping("/create")
    public String createForm(@ModelAttribute("student")Student student){
        int id = new Random().nextInt(100);
        student.setId(id);
        return "create";

    }
    @PostMapping("/create")
    public String create(@ModelAttribute("student")Student student,Model model){
        studentService.save(student);
        model.addAttribute("message","New student was created");
        return "create";
    }
    @GetMapping("/edit")
    public String editForm (@RequestParam int id,Model model){
        model.addAttribute("student",studentService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute("student")Student student,Model model){
        studentService.update(student);
        model.addAttribute("message","Student was updated");
        return "edit";
    }
    @GetMapping("/delete")
    public String deleteForm (@RequestParam int id,Model model){
        model.addAttribute("student",studentService.findById(id));
        return "delete";
    }
    @PostMapping
    public String delete(@ModelAttribute("student") Student student){
        studentService.remove(student.getId());
        return "delete";
    }
    @GetMapping(value = "/view")
    public String view(@RequestParam int id, Model model){
        Student student = this.studentService.findById(id);
        model.addAttribute("student", student);
        return "view";
    }


}
