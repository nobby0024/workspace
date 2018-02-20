package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/compare")
public class CompareController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
}
