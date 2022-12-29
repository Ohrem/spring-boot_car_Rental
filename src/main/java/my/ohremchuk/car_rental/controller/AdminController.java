package my.ohremchuk.car_rental.controller;

import my.ohremchuk.car_rental.entity.CarEntity;
import my.ohremchuk.car_rental.entity.OrderEntity;
import my.ohremchuk.car_rental.entity.PaymentEntity;
import my.ohremchuk.car_rental.entity.UserEntity;
import my.ohremchuk.car_rental.repository.CarRepository;
import my.ohremchuk.car_rental.repository.OrderRepository;
import my.ohremchuk.car_rental.repository.PaymentRepository;
import my.ohremchuk.car_rental.repository.UserRepository;
import my.ohremchuk.car_rental.request.GetAllCarsByBrandRq;
import my.ohremchuk.car_rental.service.CarService;
import my.ohremchuk.car_rental.service.OrderService;
import my.ohremchuk.car_rental.service.PaymentService;
import my.ohremchuk.car_rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private CarService carService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserService userService;

    @GetMapping("admin/getAllCars")
    public ResponseEntity<List<CarEntity>> getAllCars() {
        return new ResponseEntity<>(carService.findAll(), HttpStatus.OK);
    }

    @GetMapping("admin/getAllOrders")
    public ResponseEntity<List<OrderEntity>> getAllOrders() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

    @GetMapping("admin/getAllPayments")
    public ResponseEntity<List<PaymentEntity>> getAllPayments() {
        return new ResponseEntity<>(paymentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("admin/getAllUsers")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("admin/getAllByBrand")
    public ResponseEntity<List<CarEntity>> getAllCarsByBrand(@RequestBody GetAllCarsByBrandRq rq) {
        System.out.println("REQUEST: " + rq);
        return new ResponseEntity<>(carService.findAllCarsByBrand(rq.getBrand(), PageRequest.of(rq.getPage(), rq.getPageAmount())), HttpStatus.OK);
    }
}
