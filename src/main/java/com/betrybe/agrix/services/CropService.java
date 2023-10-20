package com.betrybe.agrix.services;

import com.betrybe.agrix.dtos.CropDto;
import com.betrybe.agrix.models.entities.Crop;
import com.betrybe.agrix.models.entities.Farm;
import com.betrybe.agrix.models.repositories.CropRepository;
import com.betrybe.agrix.models.repositories.FarmRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class represents a crop service.
 */
@Service
public class CropService {

  @Autowired
  private CropRepository cropRepository;

  @Autowired
  private FarmRepository farmRepository;

  @Autowired
  private FarmService farmService;

  /**
   * This method creates a crop.
   */
  public CropDto createCrop(Integer farmId, CropDto cropDto) {
    Optional<Farm> farmOptional = farmRepository.findById(farmId);

    if (farmOptional.isPresent()) {
      Farm farm = farmOptional.get();
      Crop crop = new Crop();
      crop.setName(cropDto.name());
      crop.setPlantedArea(cropDto.plantedArea());
      crop.setFarm(farm);
      Crop savedCrop = cropRepository.save(crop);
      return CropDto.fromCrop(savedCrop);
    } else {
      throw new RuntimeException("Fazenda não encontrada!");
    }
  }
}
