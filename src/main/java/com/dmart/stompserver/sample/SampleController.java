package com.dmart.stompserver.sample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SampleController {

    @GetMapping
    public Sample sample() {
        return new Sample("pending", "This is my pending");
    }


}
