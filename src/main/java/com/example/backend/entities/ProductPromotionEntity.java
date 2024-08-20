package com.example.backend.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "product_promotion", schema = "dbo", catalog = "phan-mem-ban-ao")
@IdClass(ProductPromotionEntityPK.class)
public class ProductPromotionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "promotion_id")
    private int promotionId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_detail_id")
    private int productDetailId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
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
        ProductPromotionEntity that = (ProductPromotionEntity) o;
        return promotionId == that.promotionId && productDetailId == that.productDetailId && id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, productDetailId, id);
    }
}
