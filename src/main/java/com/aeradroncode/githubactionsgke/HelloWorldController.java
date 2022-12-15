package com.aeradroncode.githubactionsgke;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "Si llegaste a acá es porque tu proyecto levantó en el cluster de GKE!";
    }
}
