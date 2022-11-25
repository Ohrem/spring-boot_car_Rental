package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.PaymentEntity;
import my.ohremchuk.car_rental.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService implements AbstractService<Long, PaymentEntity> {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void save(PaymentEntity entity) {
        paymentRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public Optional<PaymentEntity> findById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public List<PaymentEntity> findAll() {
        return (List<PaymentEntity>) paymentRepository.findAll();
    }
}
