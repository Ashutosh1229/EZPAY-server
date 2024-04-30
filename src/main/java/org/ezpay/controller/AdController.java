package org.ezpay.controller;

import org.ezpay.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ad")
public class AdController {
    @Autowired
    private KafkaService kafkaService;
    @PostMapping("/message")
    public ResponseEntity<?> sendAd(@RequestBody String message){
        this.kafkaService.sendAds(message);
        return ResponseEntity.status(HttpStatus.OK).body(message+": ad published");
    }
}
