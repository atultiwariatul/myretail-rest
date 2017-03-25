package com.atul.retail.domain.product;

import com.atul.retail.domain.AbstractDocument;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by atiwa00 on 6/4/16.
 */
//@CompoundIndexes({
//        @CompoundIndex(name = "productId", def = "{'lastName': 1, 'age': -1}")
//})

public class Product extends AbstractDocument {
    @Id
    private String id;
    private String displayName;
    private String merchantId;
    private Details details;
    private Shipping shipping;
    private Price pricing;
    private Dimension dimension;
    @Indexed
    private String[] tags;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Price getPricing() {
        return pricing;
    }

    public void setPricing(Price pricing) {
        this.pricing = pricing;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", displayName='" + displayName + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", details=" + details +
                ", shipping=" + shipping +
                ", pricing=" + pricing +
                '}';
    }
}
