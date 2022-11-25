package my.ohremchuk.car_rental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentRepository, Long> {
}
