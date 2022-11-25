package my.ohremchuk.car_rental.service;

import my.ohremchuk.car_rental.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface AbstractService<K extends Serializable, E extends BaseEntity<K>> {

    void save(E entity);

    void delete(K id);

    Optional<E> findById(K id);

    List<E> findAll();
}
