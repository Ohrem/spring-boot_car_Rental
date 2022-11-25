package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.OrderEntity;
import my.ohremchuk.car_rental.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements AbstractService<Long, OrderEntity> {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void save(OrderEntity entity) {
        orderRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Optional<OrderEntity> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<OrderEntity> findAll() {
        return (List<OrderEntity>) orderRepository.findAll();
    }
}
