package com.betrybe.agrix.dtos;

import com.betrybe.agrix.models.entities.Crop;

/**
 * This class represents a crop dto.
 */
public record CropDto(Integer id, String name, Double plantedArea, Integer farmId) {
  public static CropDto fromCrop(Crop crop) {
    return new CropDto(crop.getId(), crop.getName(), crop.getPlantedArea(), crop.getFarm().getId());
  }

}
