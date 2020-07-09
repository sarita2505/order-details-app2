package com.spring.dao;

import java.util.List;

public interface IOrderData<T, I> {
    public I save(T t);

    I update(T t, I i);

    I delete(I i);

    List<T> select();

    T selectById(I i);

}
