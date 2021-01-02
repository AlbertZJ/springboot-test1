package shuguoyiyou.shu.guo.springboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest1Application.class, args);
    }

    @GetMapping("/hello")
    public String Hello(){
        return "Hello Docker";
    }
}
