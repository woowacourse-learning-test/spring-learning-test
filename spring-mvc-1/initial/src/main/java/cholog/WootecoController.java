package cholog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// TODO: 애노테이션을 수정하여 응답 본문으로 JSON이 반환되도록 설정하세요.
@Controller
public class WootecoController {

    @GetMapping("/wooteco")
    public Person json() {
        return new Person("brown", 20);
    }
}
