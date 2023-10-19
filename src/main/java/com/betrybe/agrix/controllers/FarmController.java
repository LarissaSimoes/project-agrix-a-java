package com.betrybe.agrix.controllers;

import com.betrybe.agrix.dtos.FarmDto;
import com.betrybe.agrix.dtos.FarmResponseDto;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.services.FarmService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class represents a farm controller.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {

  private final FarmService farmService;

  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * This method creates a farm.
   */
  @PostMapping
  public ResponseEntity<FarmResponseDto> create(@RequestBody FarmDto farmDto) {
    Farm newFarm = farmService.create(farmDto.toFarm());
    FarmResponseDto farmResponseDto = FarmResponseDto.fromFarm(newFarm);
    return ResponseEntity.status(201).body(farmResponseDto);
  }

  /**
   * This method finds all farms.
   */
  @GetMapping
  public List<FarmResponseDto> findAll() {
    List<Farm> farms = farmService.findAll();
    return farms.stream()
        .map(FarmResponseDto::fromFarm)
        .toList();
  }
}
