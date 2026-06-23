package dgsw.hs.kr.cicid_springboot01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("")
    public String hello() {
        int i = 0;
        int j = 0;
        return "Hello World";
    }
}
