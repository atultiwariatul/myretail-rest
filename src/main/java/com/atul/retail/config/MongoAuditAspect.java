package com.atul.retail.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * An Aspect which will update lastModifiedDate automatically whenever we are going to update an entity
 * in Collection.
 *
 * Created by atiwa00 on 6/4/16.
 */
@Aspect
public class MongoAuditAspect {

    @Before(value = "(execution(public * org.springframework.data.mongodb.core.MongoOperations.update*(..))  && args(query,update,.. ))")
    public void setAuditFields(Query query, Update update) {
        if (update != null) {
            update.set("lastModifiedDate", new DateTime().now().toDateTimeISO());
        }
    }
}