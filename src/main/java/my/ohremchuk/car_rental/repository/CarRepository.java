package my.ohremchuk.car_rental.repository;

import my.ohremchuk.car_rental.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, Long> {
    void deleteById(Long id);

    CarEntity findByBrandAndModelAndColorAndPrice(String brand, String model, String color, Double price);
}
