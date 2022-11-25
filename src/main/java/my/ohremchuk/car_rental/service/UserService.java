package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.UserEntity;
import my.ohremchuk.car_rental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements AbstractService<Long, UserEntity> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserEntity entity) {
        userRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return (List<UserEntity>) userRepository.findAll();
    }
}
