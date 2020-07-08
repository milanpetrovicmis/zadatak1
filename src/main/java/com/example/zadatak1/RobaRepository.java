package com.example.zadatak1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zadatak1.Roba;

@Repository
public interface RobaRepository extends JpaRepository<Roba, Long>{

}
