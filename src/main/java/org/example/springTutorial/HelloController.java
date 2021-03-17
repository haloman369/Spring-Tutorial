package org.example.springTutorial;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }



    @RequestMapping(value = "/ApemanStrikes/{id}" , method = GET)
    public String index(@PathVariable("id") String id) {
        //String id = "test";
        return "Greetings from " + id + ".\n";
    }

}
