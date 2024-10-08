package mixture.example.demos;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "hello Stranger"+ request.getSession().getId();
    }
}
