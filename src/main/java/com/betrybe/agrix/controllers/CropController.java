package com.betrybe.agrix.controllers;

import com.betrybe.agrix.dtos.CropDto;
import com.betrybe.agrix.services.CropService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class represents a crop controller.
 */
@RestController
@RequestMapping("/crops")
public class CropController {

  @Autowired
  private CropService cropService;

  /**
   * This method gets all crops.
   */
  @GetMapping
  public ResponseEntity<List<CropDto>> getAllCrops() {
    List<CropDto> crops = cropService.getAllCrops();
    return ResponseEntity.status(HttpStatus.OK).body(crops);
  }

  /**
   * This method gets a crop by id.
   */
  @GetMapping("/{id}")
  public ResponseEntity<Object> getCropById(@PathVariable("id") Integer id) {
    Optional<CropDto> cropOptional = cropService.findById(id);

    if (cropOptional.isPresent()) {
      return ResponseEntity.status(HttpStatus.OK).body(cropOptional.get());
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Plantação não encontrada!");
    }
  }

}
