package com.dangvandat.dto.response;

import java.sql.Timestamp;
import java.util.Date;

public class ProductResponse {
    private Long id;
    private String name;
    private String code;
    private String title;
    private String status;
    private String avatar;
    private String description;
    private String categoryName;
    private String categoryCode;
    private String manufacturerName;
    private String manufacturerCode;
    private Integer price;
    private Long totalView;
    private Long categoryId;
    private String base64OfServer;
    private String typeFile;
    private String createdBy;
    private Date createdDate;

    public ProductResponse() {
    }

    public ProductResponse(Long id, String name, String code, String title, String status, String avatar, String description, String categoryName, String categoryCode, Integer price, Long totalView, Long categoryId, String typeFile , String manufacturerCode, String manufacturerName, String createdBy , Date createdDate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.title = title;
        this.status = status;
        this.avatar = avatar;
        this.description = description;
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
        this.price = price;
        this.totalView = totalView;
        this.categoryId = categoryId;
        this.typeFile = typeFile;
        this.manufacturerCode = manufacturerCode;
        this.manufacturerName = manufacturerName;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getTotalView() {
        return totalView;
    }

    public void setTotalView(Long totalView) {
        this.totalView = totalView;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getBase64OfServer() {
        return base64OfServer;
    }

    public void setBase64OfServer(String base64OfServer) {
        this.base64OfServer = base64OfServer;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
