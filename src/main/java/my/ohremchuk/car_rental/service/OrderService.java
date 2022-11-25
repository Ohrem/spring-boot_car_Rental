package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.OrderEntity;

import java.util.List;
import java.util.Optional;

public class OrderService implements AbstractService<Long, OrderEntity>{
    @Override
    public void save(OrderEntity entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(OrderEntity entity) {

    }

    @Override
    public Optional<OrderEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<OrderEntity> findAll() {
        return null;
    }
}
