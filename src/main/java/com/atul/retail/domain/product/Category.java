package com.atul.retail.domain.product;

import org.springframework.data.mongodb.core.index.Indexed;

/**
 * A category to which the Product belongs.
 * Created by atiwa00 on 6/4/16.
 */
public class Category {

    private Integer categoryId;

    private String categoryName;

    private String description;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nCategory{" +
                ", categoryId=" + categoryId +
                ", description='" + description + '\'' +
                '}';
    }
}
