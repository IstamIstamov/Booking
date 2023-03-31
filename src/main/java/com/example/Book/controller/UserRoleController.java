package com.example.Book.controller;


import com.example.Book.dto.ResponseDto;
import com.example.Book.dto.UserRoleDto;
import com.example.Book.service.UserRoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    private UserRoleService userRoleService;
    @PostMapping("/create")
    public ResponseDto<UserRoleDto> createAddress(@RequestBody UserRoleDto userRoleDto){
        return this.userRoleService.create(userRoleDto);
    }
    @GetMapping("/get")
    public ResponseDto<UserRoleDto> getAddress(@RequestParam Integer id){
        return this.userRoleService.get(id);
    }
    @PutMapping("/update")
    public ResponseDto<UserRoleDto> updateAddress(@RequestBody UserRoleDto userRoleDto, @RequestParam Integer id){
        return this.userRoleService.update(userRoleDto,id);
    }
    @DeleteMapping("/delete")
    public ResponseDto<UserRoleDto> deleteAddress(@RequestParam Integer id){
        return this.userRoleService.delete(id);
    }
}
