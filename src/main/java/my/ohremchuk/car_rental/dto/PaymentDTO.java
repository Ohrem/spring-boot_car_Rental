package my.ohremchuk.car_rental.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PaymentDTO {
    private Long orderId;
    private LocalDate paymentDate;
    private Double paymentSum;
}
