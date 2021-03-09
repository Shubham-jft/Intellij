package test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
   @RequestMapping("/hello")
    public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m)
   {
       if(pass.equals("Shubham"))
       {
           String msg="Hello"+name;
           m.addAttribute("message",msg);
           return "viewpage";
       }
       else
           {
            String msg="Sorry "+name+ ".You entered an incorrect password";
            m.addAttribute("message",msg);
            return "errorpage";
           }
   }


}