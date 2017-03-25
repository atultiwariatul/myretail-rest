package com.atul.retail.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by atiwa00 on 6/4/16.
 */
@XmlRootElement(name = "merchant")
public class Merchant {
    @Id
    private String id;
    private String merchantName;
    private Address merchantAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
