package com.dangvandat.entity;

import com.dangvandat.dto.response.ProductResponse;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Table
@Entity(name = "products")
@SqlResultSetMapping(name = "findAllProductsByCondition" , classes = {
        @ConstructorResult(targetClass = ProductResponse.class ,
                columns = {
                        @ColumnResult(name = "id", type = Long.class),
                        @ColumnResult(name = "name", type = String.class),
                        @ColumnResult(name = "code", type = String.class),
                        @ColumnResult(name = "title", type = String.class),
                        @ColumnResult(name = "status", type = String.class),
                        @ColumnResult(name = "avatar", type = String.class),
                        @ColumnResult(name = "description", type = String.class),
                        @ColumnResult(name = "category_name", type = String.class),
                        @ColumnResult(name = "category_code", type = String.class),
                        @ColumnResult(name = "price", type = Integer.class),
                        @ColumnResult(name = "total_view", type = Long.class),
                        @ColumnResult(name = "category_id", type = Long.class),
                        @ColumnResult(name = "type_file", type = String.class),
                        @ColumnResult(name = "manufacturer_code", type = String.class),
                        @ColumnResult(name = "manufacturer_name", type = String.class),
                        @ColumnResult(name = "created_by", type = String.class),
                        @ColumnResult(name = "created_date", type = Date.class)
                })
})
public class ProductsEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private String status;

    @Column(name = "price")
    private Integer price;

    @Column(name = "total_view")
    private Long totalView;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "typefile")
    private String typeFile;

    @Column(name = "origin")
    private String origin;

    @Column(name = "description" , columnDefinition = "TEXT")
    private String description;

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
}
