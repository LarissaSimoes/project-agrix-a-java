package com.betrybe.agrix.models.repositories;

import com.betrybe.agrix.models.entities.Crop;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface represents a crop repository.
 */
@Repository
public interface CropRepository extends JpaRepository<Crop, Integer> {
  List<Crop> findByFarmId(Integer farmId);

}
