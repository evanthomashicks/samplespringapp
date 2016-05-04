package tiy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Justins PC on 5/3/2016.
 */
@Controller
public class ClientAppController {
    public void startPrompt() {
        System.out.println("Starting client app controller");
    }
//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public String home(Model model, HttpSession session) {
//        model.addAttribute("userText", session.getAttribute("userName"));
//        session.removeAttribute("userName");
//        return "home";
//    }
////    @RequestMapping(path = "/login", method = RequestMethod.POST)
//    public String login(HttpSession session, String userName) {
//        session.setAttribute("userName", userName);
//        System.out.print(userName);
//        return "redirect:/";
//    }
}
