package mixture.example.demos;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"hari",89),
            new Student(2,"manni",90)
    ));

    @GetMapping("/Students")
    public List<Student> lists(){
        return students;
    }

    @GetMapping("csrf")
    public CsrfToken Token(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
