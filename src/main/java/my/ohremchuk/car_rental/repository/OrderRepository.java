package my.ohremchuk.car_rental.repository;

import my.ohremchuk.car_rental.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<OrderEntity, Long> {
    List<OrderEntity> findAllByBeginDate(LocalDate date);
}
