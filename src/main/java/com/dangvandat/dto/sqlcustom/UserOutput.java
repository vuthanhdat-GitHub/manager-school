package com.dangvandat.dto.sqlcustom;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserOutput {
    private Long id;
    private Date createdDate;
    private Date modifiedDate;
    private String createdBy;
    private String modifiedBy;
    private String fullName;
    private String username;
    private Integer status;

    public UserOutput() {
    }

    public UserOutput(Long id, Date createdDate, Date modifiedDate, String createdBy, String modifiedBy, String fullName, String username, Integer status) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.fullName = fullName;
        this.username = username;
        this.status = status;
    }
}
