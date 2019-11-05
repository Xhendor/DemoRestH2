package com.uabc.rest.example.controller;

import com.uabc.rest.example.model.Saludo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaludoController {


  private static final String template = "Hola, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/greeting")
  public Saludo greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new Saludo(counter.incrementAndGet(),
      String.format(template, name));
  }

}
