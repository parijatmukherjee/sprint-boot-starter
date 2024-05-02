package ${package}.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("Hi There!!! The service is up.", HttpStatus.OK);
    }
}

