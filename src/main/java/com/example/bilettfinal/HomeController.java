package com.example.bilettfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private BillettRepository rep;

    @PostMapping("/lagre")
    public void kjopBillett(@RequestBody Billett innBillett) {
        rep.lagreBillett(innBillett);
    }

    @GetMapping("/hentAlle")
    public List<Billett> getAllBookings() {
        return rep.hentAlleBilletter();
    }

    @GetMapping("/slett")
    public void slettAlleBilletter() {
        rep.slettAlleBilletter();
    }

}
