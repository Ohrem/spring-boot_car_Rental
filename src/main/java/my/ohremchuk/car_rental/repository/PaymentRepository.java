package my.ohremchuk.car_rental.repository;

import my.ohremchuk.car_rental.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends PagingAndSortingRepository<PaymentEntity, Long> {
}
