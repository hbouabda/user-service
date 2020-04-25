package com.skills.controller;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RefreshScope
public class UserController {

    /*@Value("${xParam}")
    private String xParam;

    @Value("${yParam}")
    private String yParam;

    @Value("${mail}")
    private String mail;*/

    /*@GetMapping("/message")
    public Map<String,Object> getProperties(){

        Map<String,Object> maps = new HashMap<String,Object>();
        maps.put("xParam", xParam );
        maps.put("yParam", yParam );
        maps.put("mail", mail );

        return maps;
    }*/

    @GetMapping("/message")
    public String getMessage(){
        return "message";
    }
}
