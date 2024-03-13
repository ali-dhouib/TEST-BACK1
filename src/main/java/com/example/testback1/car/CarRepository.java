package com.example.testback1.car;

import com.example.testback1.enums.FuelType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {

    @Query("SELECT Car from Car C WHERE c.fuelType=?1 and c.price>=?2")
    List<Car> findCarsByFuelTypeAndMaxPrice(FuelType fuelType,double maxPrice);

    @Modifying
    @Transactional
    @Query("UPDATE Car c SET c.picture = ?2 WHERE c.id = ?1")
    boolean updateCarPicture(Long carId, String picture);
}
