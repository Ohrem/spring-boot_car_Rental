package my.ohremchuk.car_rental.mapper;

import my.ohremchuk.car_rental.dto.OrderFullInfoDTO;
import my.ohremchuk.car_rental.entity.CarEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarEntityMapper {

    ModelMapper modelMapper = new ModelMapper();

    public CarEntity carMapperToEntity(OrderFullInfoDTO orderFullInfoDTO) {
        return modelMapper.map(orderFullInfoDTO, CarEntity.class);
    }
}
