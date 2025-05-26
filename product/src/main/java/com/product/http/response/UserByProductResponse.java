package com.product.http.response;

import com.product.controller.DTO.UserDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserByProductResponse {

    private String nombre;

    private String descripcion;

    private  float precio;

    private List<UserDto> userDtoList;

}
