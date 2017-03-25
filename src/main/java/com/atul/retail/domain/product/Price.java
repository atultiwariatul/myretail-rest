package com.atul.retail.domain.product;

/**
 * Created by atiwa00 on 6/4/16.
 */
public class Price {
    private float listPrice;
    private Integer discountPercentage;
    private float afterDiscountPrice;
    private CURRENCY currency;
    private float currentPrice;

    public float getListPrice() {
        return listPrice;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public float getAfterDiscountPrice() {
        return afterDiscountPrice;
    }

    public void setAfterDiscountPrice(float afterDiscountPrice) {
        this.afterDiscountPrice = afterDiscountPrice;
    }

    public CURRENCY getCurrency() {
        return currency;
    }

    public void setCurrency(CURRENCY currency) {
        this.currency = currency;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    enum CURRENCY{
        USD,EURO,INR,YEN;
    }

    @Override
    public String toString() {
        return "\n Price{" +
                "listPrice=" + listPrice +
                ", discountPercentage=" + discountPercentage +
                ", afterDiscountPrice=" + afterDiscountPrice +
                ", currency=" + currency +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
