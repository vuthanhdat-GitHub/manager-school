package com.dangvandat.api.admin;

import com.dangvandat.constants.AppConstant;
import com.dangvandat.dto.UserDTO;
import com.dangvandat.service.UserService;
import com.dangvandat.util.response.ResponseEntityBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/user")
public class UserAPI {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "" , method = RequestMethod.GET)
    public ResponseEntity<?> getAllUser() {
        List<UserDTO> users = userService.getAllUser();
        return ResponseEntityBuilder.getBuilder()
                .setDetails(users)
                .setMessage(AppConstant.message.user.GET_ALL_USER_SUCCESS)
                .build();
    }
}
