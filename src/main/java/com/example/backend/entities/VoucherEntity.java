package com.example.backend.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "voucher", schema = "dbo", catalog = "phan-mem-ban-ao")
public class VoucherEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "discount_amount")
    private String discountAmount;
    @Basic
    @Column(name = "discount_percent")
    private String discountPercent;
    @Basic
    @Column(name = "expiration_date")
    private Date expirationDate;
    @Basic
    @Column(name = "min_purchase_amount")
    private String minPurchaseAmount;
    @Basic
    @Column(name = "max_discount_amount")
    private String maxDiscountAmount;
    @Basic
    @Column(name = "terms_and_conditions")
    private String termsAndConditions;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "created_at")
    private String createdAt;
    @Basic
    @Column(name = "updated_at")
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(String discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMinPurchaseAmount() {
        return minPurchaseAmount;
    }

    public void setMinPurchaseAmount(String minPurchaseAmount) {
        this.minPurchaseAmount = minPurchaseAmount;
    }

    public String getMaxDiscountAmount() {
        return maxDiscountAmount;
    }

    public void setMaxDiscountAmount(String maxDiscountAmount) {
        this.maxDiscountAmount = maxDiscountAmount;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoucherEntity that = (VoucherEntity) o;
        return id == that.id && Objects.equals(code, that.code) && Objects.equals(discountAmount, that.discountAmount) && Objects.equals(discountPercent, that.discountPercent) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(minPurchaseAmount, that.minPurchaseAmount) && Objects.equals(maxDiscountAmount, that.maxDiscountAmount) && Objects.equals(termsAndConditions, that.termsAndConditions) && Objects.equals(status, that.status) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, discountAmount, discountPercent, expirationDate, minPurchaseAmount, maxDiscountAmount, termsAndConditions, status, createdAt, updatedAt);
    }
}
