package org.hung.aws;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@RestController
public class EchoController {
    
    @GetMapping("/echo")
    public String echo(@RequestParam(defaultValue = "john") String name) {
        log.info("request to echo endpoint " + name);
        return "Hello " + name + "!";
    }
}
