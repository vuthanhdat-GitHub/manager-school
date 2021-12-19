package com.dangvandat.util.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageList<T> {
    private int currentPage;
    private int pageSize;
    private long total;
    private boolean success;
    private int totalPage;
    private List<T> list;

    public void getTotalPage(int ceil) {
    }

    public void getList(List<T> studentDTOS) {
    }
}
