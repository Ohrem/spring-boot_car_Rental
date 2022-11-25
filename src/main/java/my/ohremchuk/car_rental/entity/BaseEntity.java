package my.ohremchuk.car_rental.entity;

import java.io.Serializable;

public interface BaseEntity<T extends Serializable> {

    void setId(T id);

    T getId();
}