package com.example.canjura.service.impl;

import com.example.canjura.domain.entity.Mago;
import com.example.canjura.repository.MagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MagoServiceImpl implements MagoService  {

    private final MagoRepository magoRepository;

    public MagoServiceImpl(MagoRepository magoRepository) {
        this.magoRepository = magoRepository;
    }

    @Override
    public Mago create(Mago Mago) {
        return magoRepository.save(Mago);
    }

    @Override
    public List<Mago> findAll() {
        return magoRepository.findAll();
    }

    @Override
    public List<Mago> findDeatheaters() {
        return magoRepository.findByIsDeatheaterTrue();
    }

    @Override
    public Mago update(UUID id, Mago Mago) {
        Mago existingMago = magoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mago not found with id: " + id));

        existingMago.setName(Mago.getName());
        existingMago.setHouse(Mago.getHouse());
        existingMago.setPatronus(Mago.getPatronus());
        existingMago.setIsDeatheater(Mago.getIsDeatheater());

        return magoRepository.save(existingMago);
    }

    @Override
    public List<Mago> findByPatronus(String patronus) {
        return magoRepository.findByPatronus((patronus));
    }

    @Override
    public void delete(UUID id) {
        Mago existingMago = magoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mago not found with id: " + id));

        magoRepository.delete(existingMago);
    }
}