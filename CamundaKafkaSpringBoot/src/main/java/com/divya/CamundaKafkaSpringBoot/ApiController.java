package com.divya.CamundaKafkaSpringBoot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController  {


    @PostMapping("/complete/message")
    public void sendMail(@RequestBody String processState){
        System.out.println("=========PROCESS: "+processState+"  IS COMPLETED======");

    }


}
