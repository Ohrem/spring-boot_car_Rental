package my.ohremchuk.car_rental.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderDTO {
    private LocalDate beginDate;
    private LocalDate endDate;
    private String message;
}
