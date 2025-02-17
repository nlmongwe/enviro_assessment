package com.enviro.assessment.grad001.ntwanano.mongwe.demo.controller;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Waste;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.service.WasteService;
import com.enviro.assessment.grad001.ntwanano.mongwe.demo.util.SuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/waste")
public class WasteController {

    private final WasteService wasteService;

    @Autowired
    public WasteController(WasteService wasteService) {
        this.wasteService = wasteService;
    }

    @GetMapping
    public List<Waste> getWaste(){
        return wasteService.getWaste();
    }

    @GetMapping(path = "/{wasteId}")
    public Waste getWastById(@PathVariable(required = false) Integer wasteId){
        return wasteService.getWasteById(wasteId);

    }

    @PostMapping(path = "/add")
    public ResponseEntity<SuccessResponse> addWaste(@RequestBody Waste newWaste){
        SuccessResponse successResponse = wasteService.addWaste(newWaste);
        return ResponseEntity.status(HttpStatus.CREATED).body(successResponse);
    }

    @PostMapping(path = "/delete")
    public ResponseEntity<SuccessResponse> deleteWaste(@RequestBody Waste oldWaste){
        SuccessResponse successResponse = wasteService.deleteWaste(oldWaste);
        return ResponseEntity.status(HttpStatus.GONE).body(successResponse);
    }

    @PostMapping(path = "/delete/byId")
    public ResponseEntity<SuccessResponse> deleteWasteById(@RequestBody Map<String, Integer> requestBody){
        Integer id = requestBody.get("id");
        SuccessResponse successResponse = wasteService.deleteWasteById(id);
        return ResponseEntity.status(HttpStatus.GONE).body(successResponse);
    }

    @PutMapping(path = "update/{id}")
    public  ResponseEntity<SuccessResponse> updateWaste(@PathVariable(required = false)Integer id, @RequestBody Waste waste){
        SuccessResponse successResponse = wasteService.updateWaste(id,waste);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(successResponse);
    }
}
