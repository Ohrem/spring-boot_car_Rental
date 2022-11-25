package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public class UserService implements AbstractService<Long, UserEntity> {
    @Override
    public void save(UserEntity entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(UserEntity entity) {

    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }
}
