package com.example.Book.controller;

import com.example.Book.dto.AddressDto;
import com.example.Book.dto.ResponseDto;
import com.example.Book.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    private AddressService addressService;

    @PostMapping("/create")
    public ResponseDto<AddressDto> createAddress(@RequestBody AddressDto addressDto) {
        return this.addressService.create(addressDto);
    }

    @GetMapping("/get")
    public ResponseDto<AddressDto> getAddress(@RequestParam Integer imageId) {
        return this.addressService.get(imageId);
    }

    @PutMapping("/update")
    public ResponseDto<AddressDto> updateAddress(@RequestBody AddressDto addressDto, @RequestParam Integer imageId) {
        return this.addressService.update(addressDto, imageId);
    }

    @DeleteMapping("/delete")
    public ResponseDto<AddressDto> deleteAddress(@RequestParam Integer imageId) {
        return this.addressService.delete(imageId);
    }
}
