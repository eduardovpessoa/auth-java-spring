package br.com.xpe.auth.hotels;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

    @GetMapping
    public ResponseEntity<String> getHotels() {
        return ResponseEntity.ok("Working!");
    }

}
