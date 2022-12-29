package my.ohremchuk.car_rental.repository;

import my.ohremchuk.car_rental.entity.CarEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends PagingAndSortingRepository<CarEntity, Long> {
    void deleteById(Long id);

    CarEntity findByBrandAndModelAndColorAndPrice(String brand, String model, String color, Double price);

    List<CarEntity> findByBrand(String brand, Pageable pageable);
}
