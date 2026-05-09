package com.example.canjura.controller;


import com.example.canjura.domain.entity.Mago;
import com.example.canjura.service.impl.MagoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/Magos")
public class MagoController {

    private final MagoService MagoService;

    public MagoController(MagoService MagoService) {
        this.MagoService = MagoService;
    }

    @PostMapping
    public ResponseEntity<Mago> create(@RequestBody Mago Mago) {
        Mago createdMago = MagoService.create(Mago);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMago);
    }

    @GetMapping
    public ResponseEntity<List<Mago>> findAll() {
        return ResponseEntity.ok(MagoService.findAll());
    }

    @GetMapping("/deatheaters")
    public ResponseEntity<List<Mago>> findDeatheaters() {
        return ResponseEntity.ok(MagoService.findDeatheaters());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mago> update(@PathVariable UUID id, @RequestBody Mago Mago) {
        return ResponseEntity.ok(MagoService.update(id, Mago));
    }

    @GetMapping("/patronus/{patronus}")
    public ResponseEntity<List<Mago>> findByPatronus(@PathVariable String patronus) {
        return ResponseEntity.ok(MagoService.findByPatronus(patronus));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        MagoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

