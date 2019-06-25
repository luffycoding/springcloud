package com.mengxuegu.springcloud.mapper;

import com.springcloud.entities.Product;

import java.util.List;


//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}