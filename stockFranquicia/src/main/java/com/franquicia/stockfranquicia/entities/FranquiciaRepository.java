package com.franquicia.stockfranquicia.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FranquiciaRepository extends JpaRepository<Franquicia,Long> {
}
