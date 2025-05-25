package com.product.client;


import com.product.controller.DTO.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-user",url = "localhost:8090/api/user")
public interface IUserClient {

    @GetMapping("/search-my-product/{id}")
    List<UserDto> findAllUsersByProduct(@PathVariable int id);


}
