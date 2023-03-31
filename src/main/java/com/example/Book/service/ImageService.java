package com.example.Book.service;

import com.example.Book.dto.ImageDto;
import com.example.Book.dto.ResponseDto;
import com.example.Book.model.Image;
import com.example.Book.service.mapper.ImageMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {
    private List<Image> imageList;
    private Integer index;
    private ImageMapper imageMapper;
    public ImageService(ImageMapper imageMapper){
        this.imageMapper = imageMapper;
        this.imageList = new ArrayList<>();
        this.index = 0;
    }

    public ResponseDto<ImageDto> create(ImageDto imageDto) {
        Image image = imageMapper.toEntity(imageDto);
        image.setImageId(++this.index);
        image.setCreateAt(LocalDateTime.now());
        this.imageList.add(image);
        return ResponseDto.<ImageDto>builder()
                .message("Ok")
                .success(true)
                .data(imageMapper.toDto(image))
                .build();
    }

    public ResponseDto<ImageDto> get(Integer id) {
        for (Image image:this.imageList) {
            if (image.getImageId().equals(id)){
                return ResponseDto.<ImageDto>builder()
                        .message("Ok")
                        .success(true)
                        .data(imageMapper.toDto(image))
                        .build();
            }
        }
        return ResponseDto.<ImageDto>builder()
                .message("Image is not found")
                .code(-1)
                .build();
    }

    public ResponseDto<ImageDto> update(ImageDto imageDto, Integer id) {
        for (Image image : imageList) {
            if (image.getImageId().equals(id)){
                image = imageMapper.toEntity(imageDto);
                image.setUpdateAt(LocalDateTime.now());
                this.imageList.add(image);
                return ResponseDto.<ImageDto>builder()
                        .message("Ok")
                        .data(imageMapper.toDto(image))
                        .success(true)
                        .build();
            }
        }
        return ResponseDto.<ImageDto>builder()
                .message("Image is not found")
                .code(-1)
                .build();
    }

    public ResponseDto<ImageDto> delete(Integer id) {
        for (Image image : imageList) {
            if (image.getImageId().equals(id)){
                this.imageList.remove(image);
                return ResponseDto.<ImageDto>builder()
                        .message("Ok")
                        .data(imageMapper.toDto(image))
                        .success(true)
                        .build();
            }
        }
        return ResponseDto.<ImageDto>builder()
                .message("Image is not found")
                .code(-1)
                .build();
    }

}
