package com.example.mmtms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class train {
    @GetMapping ("/train")
    public String getData() { return "redirect page to IRCTC for booking train" ; }


}