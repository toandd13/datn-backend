package com.example.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProductPromotionEntityPK implements Serializable {
    @Column(name = "promotion_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int promotionId;
    @Column(name = "product_detail_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productDetailId;
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(int productDetailId) {
        this.productDetailId = productDetailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPromotionEntityPK that = (ProductPromotionEntityPK) o;
        return promotionId == that.promotionId && productDetailId == that.productDetailId && id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, productDetailId, id);
    }
}
