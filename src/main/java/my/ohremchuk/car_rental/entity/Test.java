package my.ohremchuk.car_rental.entity;

import my.ohremchuk.car_rental.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    OrderRepository orderRepository;

    public void test() {
    }

}
