package org.hung.aws;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@RestController
public class EchoController {
    
    @GetMapping("/echo")
    public String echo(@RequestParam(defaultValue = "john") String name) {
        log.info("request to echo endpoint " + name);
        String localhost = "";
        try {
            localhost = Inet4Address.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            log.error("Failed to get localhost hostname", e);
        }
        return "Hello " + name + " from " + localhost + "!";
    }
}
