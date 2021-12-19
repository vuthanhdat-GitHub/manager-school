package com.dangvandat.repository.custom;

import com.dangvandat.dto.sqlcustom.UserOutput;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserOutput> findUserByFocusRoleAndCreatedUser(String roleFocus , Long userIdCreated , String name, Pageable pageable);
}
