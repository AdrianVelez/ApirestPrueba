package com.openbootcamp.demo.services;

import com.openbootcamp.demo.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {

    private List<Bootcamper> bootcampers = new ArrayList<>();
    public List<Bootcamper> getAll(){
        return bootcampers;
    }

    public void add( Bootcamper bootcamper){
        bootcampers.add(bootcamper);
    }

    public void delete(Bootcamper bootcamper){
        bootcampers.remove(bootcamper);
    }


    public Bootcamper get(String nombre){
        for (Bootcamper boot: bootcampers){
            if(boot.getNombre().equalsIgnoreCase(nombre)){
                return boot;
            }
        }
        return null;
    }


    public Bootcamper getVal(Double valor){
        for (Bootcamper bootval: bootcampers){
            if(bootval.getValor().equals(valor)){
                return bootval;
            }
        }
        return null;
    }




}
