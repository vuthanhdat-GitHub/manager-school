package com.dangvandat.repository.custom.impl;

import com.dangvandat.constants.AppConstant;
import com.dangvandat.dto.sqlcustom.UserOutput;
import com.dangvandat.entity.UserEntity;
import com.dangvandat.repository.custom.UserRepositoryCustom;
import com.dangvandat.util.BuildQueryUtils;
import com.dangvandat.util.repository.RepositoryCustomUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Repository
public class UserRepositoryImpl extends RepositoryCustomUtils<UserEntity> implements UserRepositoryCustom {
    @Override
    public List<UserOutput> findUserByFocusRoleAndCreatedUser(String roleFocus, Long userIdCreated, String name, Pageable pageable) {
        Map<String, Object> parameter = new HashMap<>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ");
        sql.append("    u.id, ");
        sql.append("    u.createddate, ");
        sql.append("    u.modifieddate, ");
        sql.append("    u.createdby, ");
        sql.append("    u.modifiedby, ");
        sql.append("    u.fullname, ");
        sql.append("    u.username, ");
        sql.append("    u.status, ");
        sql.append("    u.email, ");
        sql.append("    u.numberphone, ");
        sql.append("    u.wallet ");
        sql.append("FROM users u ");
        sql.append("WHERE 1=1 ");
        if (!roleFocus.contains(AppConstant.role.ROLE_ADMIN) && !roleFocus.contains(AppConstant.role.ROLE_USER) && !roleFocus.contains("")) {
            sql.append("    AND u.focus_role LIKE :focusRole ");
            parameter.put("focusRole", roleFocus);
        }
        if (name != "") {
            sql.append("AND u.username LIKE LOWER(:name) ");
            name = name.toLowerCase(Locale.ROOT);
            parameter.put("name", BuildQueryUtils.formatLikeStringSql(name));
        }
        sql.append("    AND u.user_id_created = :userIdCreated ");
        parameter.put("userIdCreated", userIdCreated);
        sql.append(" ORDER BY u.createddate DESC");
        return this.getResultList(sql.toString(), parameter, "findAllUserByCondition", pageable);
    }
}
