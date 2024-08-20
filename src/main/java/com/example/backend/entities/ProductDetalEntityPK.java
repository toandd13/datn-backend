package com.example.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProductDetalEntityPK implements Serializable {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(name = "size_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sizeId;
    @Column(name = "color_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int colorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetalEntityPK that = (ProductDetalEntityPK) o;
        return id == that.id && productId == that.productId && sizeId == that.sizeId && colorId == that.colorId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, sizeId, colorId);
    }
}
