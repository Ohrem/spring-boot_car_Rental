package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.CarEntity;
import my.ohremchuk.car_rental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements AbstractService<Long, CarEntity> {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void save(CarEntity entity) {
        carRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Optional<CarEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CarEntity> findAll() {
        return null;
    }
}
