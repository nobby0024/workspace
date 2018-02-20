package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting/")
    public controller.Greeting greeting(@RequestParam(value = "name", defaultValue = "Nobby") String name) {
        return new controller.Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
