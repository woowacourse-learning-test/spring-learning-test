package cholog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WootecoController {

    @GetMapping("/wooteco")
    public Person json() {
        return new Person("brown", 20);
    }
}
