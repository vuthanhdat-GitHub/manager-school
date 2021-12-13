package com.dangvandat.builder;

public class ProductSearchBuilder {
    private Integer priceFrom;
    private Integer priceTo;
    private String name;
    private Long categoryId;
    private Long manufacturerId;
    private String status;
    private String code;

    public ProductSearchBuilder(builder builder) {
        this.priceFrom = builder.priceFrom;
        this.priceTo = builder.priceTo;
        this.name = builder.name;
        this.categoryId = builder.categoryId;
        this.manufacturerId = builder.manufacturerId;
        this.status = builder.status;
        this.code = builder.code;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }
    public Integer getPriceTo() {
        return priceTo;
    }
    public String getName() {
        return name;
    }
    public Long getCategoryId() {
        return categoryId;
    }
    public String getStatus() {
        return status;
    }
    public String getCode() {
        return code;
    }
    public Long getManufacturerId() {
        return manufacturerId;
    }

    public static class builder{
        private Integer priceFrom;
        private Integer priceTo;
        private String name;
        private Long categoryId;
        private Long manufacturerId;
        private String status;
        private String code;

        public builder setPriceFrom(Integer priceFrom) {
            this.priceFrom = priceFrom;
            return this;
        }
        public builder setPriceTo(Integer priceTo) {
            this.priceTo = priceTo;
            return this;
        }
        public builder setName(String name) {
            this.name = name;
            return this;
        }
        public builder setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public builder setCode(String code) {
            this.code = code;
            return this;
        }

        public builder setManufacturerId(Long manufacturerId) {
            this.manufacturerId = manufacturerId;
            return this;
        }

        public ProductSearchBuilder builder(){return new ProductSearchBuilder(this);}
    }
}
