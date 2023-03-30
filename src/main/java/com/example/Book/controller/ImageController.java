package com.example.Book.controller;

import com.example.Book.dto.ImageDto;
import com.example.Book.dto.ResponseDto;
import com.example.Book.service.ImageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("image")
public class ImageController {
    private ImageService imageService;

    private ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/create")
    public ResponseDto<ImageDto> createImage(@RequestBody ImageDto imageDto) {
        return imageService.create(imageDto);
    }

    @GetMapping("/get")
    public ResponseDto<ImageDto> getImage(@RequestParam Integer id) {
        return imageService.get(id);
    }

    @PostMapping("/update")
    public ResponseDto<ImageDto> updateImage(@RequestBody ImageDto imageDto, @RequestParam Integer id) {
        return imageService.update(imageDto, id);
    }

    @PostMapping("/delete")
    public ResponseDto<ImageDto> deleteImage(@RequestParam Integer id) {
        return imageService.delete(id);
    }
}
