package my.ohremchuk.car_rental.repository;

import my.ohremchuk.car_rental.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByName(String name);
}
