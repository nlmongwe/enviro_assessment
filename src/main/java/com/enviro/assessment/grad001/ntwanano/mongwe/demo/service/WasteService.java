package com.enviro.assessment.grad001.ntwanano.mongwe.demo.service;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.exceptions.customExeption.DuplicateResourceException;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Waste;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.repository.WasteRepository;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.util.SuccessResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteService {

    private final WasteRepository wasteRepository;

    @Autowired
    public WasteService(WasteRepository repository) {
        this.wasteRepository = repository;
    }

    public List<Waste> getWaste(){
        return wasteRepository.findAll();
    }

    public Waste getWasteById(int wasteId){
        return wasteRepository.findById(wasteId).orElseThrow(
                ()-> new EntityNotFoundException("Waste ID: " + wasteId + " not found")
        );
    }

    public SuccessResponse addWaste(Waste waste){
        Optional<Waste> wasteOptional = wasteRepository.findWasteByName(waste.getName());
        if(wasteOptional.isPresent()){
            throw new DuplicateResourceException("Waste name: " + waste.getName() + " already in use");
        }else {
            wasteRepository.save(waste);
            return new SuccessResponse(waste);
        }
    }

    public SuccessResponse updateWaste(Integer id ,Waste newWaste){
        Optional<Waste> wasteOptional = wasteRepository.findById(id);
        if(wasteOptional.isPresent()){
            wasteOptional.map(existingWaste -> {
                existingWaste.setName(newWaste.getName());
                existingWaste.setCategoryId(newWaste.getCategoryId());
                existingWaste.setDisposalMethod(newWaste.getDisposalMethod());
                existingWaste.setRecyclingTips(newWaste.getRecyclingTips());
                return wasteRepository.save(existingWaste);
            });
            return new SuccessResponse(wasteOptional);
        }else {
            throw new EntityNotFoundException("Waste ID: " + id + " not found");
        }
    }

    public SuccessResponse deleteWaste(Waste oldWaste){
        wasteRepository.delete(oldWaste);
        return new SuccessResponse(oldWaste);
    }

    public SuccessResponse deleteWasteById(Integer wasteId){
        Optional<Waste> wasteOptional = wasteRepository.findById(wasteId);
        if(wasteOptional.isEmpty()){
            throw new EntityNotFoundException("Waste ID: " + wasteId + " not found");
        }else {
            wasteRepository.deleteById(wasteId);
            return new SuccessResponse(wasteOptional);
        }
    }
}
