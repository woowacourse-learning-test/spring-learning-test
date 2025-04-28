package cholog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/woowahan")
    public String page() {
        // TODO: /woowahan 요청 시 resources/static/techcourse.html 페이지가 응답할 수 있도록 설정하세요.
        return null;
    }
}
