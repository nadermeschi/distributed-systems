package de.hse.verteilte_systeme.hsetest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HseTestController {

    private double temp = 0;

    @GetMapping(value="/test")
    public String getTest() {
        return "Temperatur: " + temp;
    }

    @PostMapping(value="/postTest/{temperature}")
    public void postTest(@PathVariable double temperature) {
        temp = temperature;
    }
    
}
