package my.ohremchuk.car_rental;

import my.ohremchuk.car_rental.entity.UserEntity;
import my.ohremchuk.car_rental.repository.CarRepository;
import my.ohremchuk.car_rental.repository.OrderRepository;
import my.ohremchuk.car_rental.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarRentalApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDB() {
        UserEntity userEntity = userRepository.findById(1L).get();
        assertNotNull(userEntity);
    }

}
