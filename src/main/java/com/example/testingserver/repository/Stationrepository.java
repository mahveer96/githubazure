package com.example.testingserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testingserver.entity.Station;

@Repository
public interface  Stationrepository extends JpaRepository<Station ,Long>{

    
}
