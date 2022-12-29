package my.ohremchuk.car_rental.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GetAllCarsByBrandRq {
    String brand;
    Integer page;
    Integer pageAmount;
}
