package my.ohremchuk.car_rental.controller;

import my.ohremchuk.car_rental.dto.OrderFullInfoDTO;
import my.ohremchuk.car_rental.dto.PaymentDTO;
import my.ohremchuk.car_rental.entity.CarEntity;
import my.ohremchuk.car_rental.entity.OrderEntity;
import my.ohremchuk.car_rental.entity.PaymentEntity;
import my.ohremchuk.car_rental.mapper.CarEntityMapper;
import my.ohremchuk.car_rental.service.CarService;
import my.ohremchuk.car_rental.service.OrderService;
import my.ohremchuk.car_rental.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private CarService carService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private CarEntityMapper carEntityMapper;

    @GetMapping("car/getCar/{id}")
    public ResponseEntity<CarEntity> getCar(@PathVariable Long id) {
        Optional<CarEntity> carEntity = carService.findById(id);
        return carEntity.map(entity -> new ResponseEntity<>(entity, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @GetMapping("car/getAllCars")
    public ResponseEntity<List<CarEntity>> getAllCars() {
        List<CarEntity> all = carService.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OrderEntity> createNewOrder(@RequestBody OrderFullInfoDTO orderFullInfoDTO) { //TODO
        CarEntity carByParameters = carService.findCarByParameters(orderFullInfoDTO.getBrand(),
                orderFullInfoDTO.getModel(),
                orderFullInfoDTO.getColor(),
                orderFullInfoDTO.getPrice());

        OrderEntity orderEntity = OrderEntity.builder()
                .beginDate(orderFullInfoDTO.getBeginDate())
                .endDate(orderFullInfoDTO.getEndDate())
                .message(orderFullInfoDTO.getMessage())
                .carEntity(carByParameters)
                .build();

        orderService.save(orderEntity);

        return new ResponseEntity<>(orderEntity, HttpStatus.OK);
    }

    public ResponseEntity<PaymentEntity> createNewPayment(@RequestBody PaymentDTO paymentDTO) {
        Optional<OrderEntity> byId = orderService.findById(paymentDTO.getOrderId());

        if (byId.isPresent()) {
            OrderEntity orderEntity = byId.get();

            PaymentEntity paymentEntity = PaymentEntity.builder()
                    .paymentDate(paymentDTO.getPaymentDate())
                    .paymentSum(paymentDTO.getPaymentSum())
                    .build();

            orderEntity.setPaymentEntity(paymentEntity);

            orderService.save(orderEntity);

            return new ResponseEntity<>(paymentEntity, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
