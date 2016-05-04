package tiy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Justins PC on 5/3/2016.
 */
@Controller
public class SampleSpringAppController {
//    @RequestMapping(path = "/personage", method = RequestMethod.GET)
//    public String getPerson(Model model, String name, String city, int age) {
//        Person p = new Person(name, city, age);
//        model.addAttribute("Person", p);
//        Person someoneElse = new Person("Programmer", "Atlanta", 23);
//        model.addAttribute("secondPerson", someoneElse);
//        return "personabc";
//    }

    @RequestMapping(path = "/chat", method = RequestMethod.GET)
    public String home(Model model,String userText) {
        WebChatClient chat = new WebChatClient();
        chat.sendMessage(userText);
        model.addAttribute(chat);
//        chat.userInputFromPage = userText;
        System.out.println(userText);
        return "home";
    }
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String chat(HttpSession session, String userText) {
        session.setAttribute("userText", userText);
        System.out.println("userText:" + userText);
        return "redirect:/";
    }
}



