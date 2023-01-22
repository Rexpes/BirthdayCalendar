package com.example.demo.controller;

import com.example.demo.repository.CelebrationDateRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date")
public class CelebrationDateController {

    private final CelebrationDateRepository celebrationDateRepository;

    public CelebrationDateController(CelebrationDateRepository celebrationDateRepository) {
        this.celebrationDateRepository = celebrationDateRepository;
    }

    @GetMapping
    public ResponseEntity getAllCelebrationDates() {
        return ResponseEntity.ok(this.celebrationDateRepository.findAll());
    }
}
