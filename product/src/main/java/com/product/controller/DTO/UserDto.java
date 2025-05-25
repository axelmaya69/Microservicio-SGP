package com.product.controller.DTO;


import lombok.Builder;
import lombok.Data;
import org.apache.catalina.User;

import java.util.List;

@Data
@Builder
public class UserDto {

    private int id;

    private String nombre;

    private String apellidoP;

    private String  apellidoM;

    private String email;


}
