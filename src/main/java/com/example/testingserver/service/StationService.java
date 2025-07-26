package com.example.testingserver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testingserver.entity.Station;
import com.example.testingserver.repository.Stationrepository;

//;
//import com.example.charger.Repository.Stationrepository;

@Service
public class StationService {
    
    @Autowired
    private Stationrepository stationrepository;

    public Station createStation(Station station){
        return stationrepository.save(station);
    }

    public List<Station> Getallstations(){
        return stationrepository.findAll();
    }
  
     public Station updateLocation(Long Id, String  location) {
        Optional<Station> optionalStation = stationrepository.findById(Id);
        if (!optionalStation.isPresent()) {
            return null;
        }
        Station station = optionalStation.get();
      
        station.setLocation(location);
        return stationrepository.save(station);
    }




}