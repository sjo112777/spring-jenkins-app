package kr.co.sjo112777;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringJenkinsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsAppApplication.class, args);
    }

    @Controller
    public class MainController {
        @GetMapping("/")
        public String index() {
            return "/index";
        }
    }

}
