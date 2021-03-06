package br.com.rest.application;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class AlunoController {
 
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
 
    @RequestMapping("/aluno")
    public Aluno aluno(@RequestParam(value="name", defaultValue="World") String name) {
        return new Aluno(counter.incrementAndGet(), String.format(template, name));
    }
}
