package com.example.canjura.repository;

import com.example.canjura.domain.entity.Mago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MagoRepository  extends JpaRepository<Mago, UUID> {

    List<Mago> findByPatronus(String patronus);

    List<Mago> findByIsDeatheaterTrue();
}
