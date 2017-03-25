package com.atul.retail.repository;

import com.atul.retail.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by atiwa00 on 6/4/16.
 */
public interface ProductRepository extends MongoRepository<Product,String> {
    /** To Prevent Deletion of /product/:id */
    @Override
    @RestResource(exported = false)
    public void delete(Product t);

    /** to Prevent deletion of all product resources  */
    @Override
    @RestResource(exported = false)
    void deleteAll();
}
