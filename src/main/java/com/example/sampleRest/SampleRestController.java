package com.example.sampleRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SampleRestController {

    private static final String affix = "My important message to you is \"%s\"";
//    private final AtomicLong count = new AtomicLong();
    private int count = 0;

    @GetMapping("/message")
    public SampleMessage message(@RequestParam(value = "special", defaultValue = "default") String message) {
        return new SampleMessage(count++, String.format(affix, message));
    }
}
