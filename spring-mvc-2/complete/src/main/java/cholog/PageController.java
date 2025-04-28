package cholog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/woowahan")
    public String page() {
        return "/techcourse.html";
    }
}
