package com.example.Book.controller;

import com.example.Book.dto.ImageDto;
import com.example.Book.dto.ResponseDto;
import com.example.Book.dto.UserDto;
import com.example.Book.service.UserService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseDto<UserDto> createUser(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @GetMapping("/get")
    public ResponseDto<UserDto> getUser(@RequestParam Integer id) {
        return userService.get(id);
    }

    @PutMapping("/update")
    public ResponseDto<UserDto> updateUser(@RequestBody UserDto userDto, @RequestParam Integer id) {
        return this.userService.update(userDto, id);
    }

    @DeleteMapping("/delete")
    public ResponseDto<UserDto> deleteUser(@RequestBody Integer id) {

        return userService.delete(id);
    }
}
