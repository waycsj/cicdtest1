package org.example.cicdtest1;


import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cicdcontroller {
  @GetMapping("/")
  public static void main(String[] args) {
    SpringApplication.run(cicdcontroller.class, args);
  }
}
