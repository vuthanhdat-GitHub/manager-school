package com.dangvandat.dto.request;

public class HomeWebRequest {
    private int maxPageItem;
    private int pageCategory;
    private int pageCustomer;
    private Integer totalItems = 0;
    private Integer totalPage = 0;
    private String sortName;
    private String sortBy;

    public int getMaxPageItem() {
        return maxPageItem;
    }

    public void setMaxPageItem(int maxPageItem) {
        this.maxPageItem = maxPageItem;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public int getPageCategory() {
        return pageCategory;
    }

    public void setPageCategory(int pageCategory) {
        this.pageCategory = pageCategory;
    }

    public int getPageCustomer() {
        return pageCustomer;
    }

    public void setPageCustomer(int pageCustomer) {
        this.pageCustomer = pageCustomer;
    }
}
