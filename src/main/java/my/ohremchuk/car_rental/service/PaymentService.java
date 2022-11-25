package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.PaymentEntity;

import java.util.List;
import java.util.Optional;

public class PaymentService implements AbstractService<Long, PaymentEntity> {
    @Override
    public void save(PaymentEntity entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(PaymentEntity entity) {

    }

    @Override
    public Optional<PaymentEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PaymentEntity> findAll() {
        return null;
    }
}
