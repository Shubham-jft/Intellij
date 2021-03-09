package test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
    @RequestMapping("/hello2")
    public String Display()
    {
        return "viewpage1";
    }

}
