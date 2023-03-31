package com.example.Book.service.mapper;

import com.example.Book.dto.ImageDto;
import com.example.Book.model.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageMapper {
    public Image toEntity(ImageDto imageDto) {
        Image image = new Image();
        image.setPath(imageDto.getPath());
        image.setType(imageDto.getType());
        image.setSize(imageDto.getSize());
        image.setToken(imageDto.getToken());
        return image;
    }

    public ImageDto toDto(Image image) {
        ImageDto dto = new ImageDto();
        dto.setImageId(image.getImageId());
        dto.setType(image.getType());
        dto.setSize(image.getSize());
        dto.setToken(image.getToken());
        dto.setPath(image.getPath());
        dto.setCreateAt(image.getCreateAt());
        dto.setUpdateAt(image.getUpdateAt());
        return dto;
    }
}
