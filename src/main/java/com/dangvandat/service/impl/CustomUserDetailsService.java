package com.dangvandat.service.impl;

import com.dangvandat.constants.AppConstant;
import com.dangvandat.dto.UserProfile;
import com.dangvandat.entity.RoleEntity;
import com.dangvandat.entity.UserEntity;
import com.dangvandat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findOneByUserNameAndStatus(username , AppConstant.ACTIVE.ACTIVE_STATUS);
        if(userEntity == null){
            throw new UsernameNotFoundException("User Not Found");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(RoleEntity role : userEntity.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getCode()));
        }
        //put thong tin security de duy tri dang nhap cua user
        UserProfile user = new UserProfile(userEntity.getUserName() , userEntity.getPassWord()
                , true , true , true , true
                , authorities , userEntity.getFullName());
        return user;
    }
}
