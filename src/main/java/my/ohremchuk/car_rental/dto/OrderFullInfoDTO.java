package my.ohremchuk.car_rental.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderFullInfoDTO {
    private LocalDate beginDate;
    private LocalDate endDate;
    private String message;

    //Car info
    private String brand;
    private String model;
    private String color;
    private Double price;
}
