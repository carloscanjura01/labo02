package com.example.canjura.service.impl;

import com.example.canjura.domain.entity.Mago;

import java.util.List;
import java.util.UUID;

public interface MagoService {

    Mago create(Mago mago);

    List<Mago> findAll();

    List<Mago> findDeatheaters();

    Mago update(UUID id, Mago mago);

    List<Mago> findByPatronus(String patronus);

    void delete(UUID id);
}
