package com.atul.retail.repository;

import com.atul.retail.domain.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by atiwa00 on 6/4/16.
 */
@RepositoryRestResource(collectionResourceRel = "merchants", path = "merchants")
public interface MerchantRepository extends MongoRepository<Merchant,String> {
}
