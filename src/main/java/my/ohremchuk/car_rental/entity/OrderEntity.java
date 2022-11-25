package my.ohremchuk.car_rental.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class OrderEntity implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate beginDate;
    private LocalDate endDate;
    //TODO private OrderStatus orderStatus;
    private String message;
}