package my.ohremchuk.car_rental.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class PaymentEntity implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate paymentDate;
    private Double paymentSum;

}