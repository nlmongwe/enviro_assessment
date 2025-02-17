package com.enviro.assessment.grad001.ntwanano.mongwe.demo.configuration;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Waste;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.repository.WasteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class WasteConfig {

    /*
    This uses the commandLineRunner to seed data into the repository parsed as parameter,
    this data will be available soon as the server is booted up
     */
    @Bean
    CommandLineRunner wasteCommandLineRunner(WasteRepository wasteRepository){
        return args -> {
            Waste bananaPeel = new Waste("Banana Peel",1,"Compost","Add to compost bin");
            Waste plasticBottle = new Waste("Plastic Bottle",2,"Recycle","Rinse before recycling");
            Waste battery = new Waste("Battery",3,"Take to hazardous waste center","Store in cool dry place");
            //Waste styrofoam = new Waste("Styrofoam",4,"Dispose in trash","Avoid using");

            //wasteRepository.saveAll(List.of(bananaPeel,plasticBottle,battery,styrofoam));
            wasteRepository.saveAll(List.of(bananaPeel,plasticBottle,battery));
        };
    }
}
