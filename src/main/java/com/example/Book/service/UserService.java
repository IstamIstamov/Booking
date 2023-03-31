package com.example.Book.service;

import com.example.Book.dto.ResponseDto;
import com.example.Book.dto.UserDto;
import com.example.Book.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;
    private Integer index;
    private AddressService addressService;
    private UserRoleService userRoleService;

    public UserService(/*AddressService addressService, UserRoleService userRoleService*/) {
      /*  this.addressService = addressService;
        this.userRoleService = userRoleService;*/
        this.userList = new ArrayList<>();
        this.index = 0;

    }

    public ResponseDto<UserDto> create(UserDto userDto) {
        /*//AddressDto addressDto = this.addressService.g;
        if (addressDto == null) {
            return ResponseDto.<UserDto>builder()
                    .code(-1)
                    .message("Address not found!")
                    .build();
        }
        UserRoleDto userRoleDto = this.userRoleService.get();
        if (userRoleDto == null) {
            return ResponseDto.<UserDto>builder()
                    .code(-1)
                    .message("UserRole not found!")
                    .build();
        }
        User user = toEntity(userDto);
        user.setUserId(++this.index);
        user.setCreatedAt(LocalDateTime.now());
        this.userList.add(user);*/
        return null;
    }


    public ResponseDto<UserDto> get(Integer id) {

        return null;
    }

    public ResponseDto<UserDto> update(UserDto userDto, Integer id) {

        return null;
    }

    public ResponseDto<UserDto> delete(Integer id) {

        return null;
    }


   /* private User toEntity(UserDto userDto) {

        return null;
    }*/
}
