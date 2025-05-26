package com.user.controller;

import com.user.entity.User;
import com.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class ControllerUser {

    @Autowired
    IUserService userService;

    @GetMapping("/get")
    public ResponseEntity<?> obtenerUsers(){
        List<User> users =userService.obtenerUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> obtenerUser(@PathVariable int id){
        User user = userService.obtenerUser(id);
        return ResponseEntity.ok(user);
    }


    @GetMapping("/search-my-product/{id}")
    public ResponseEntity<?> findByIdProduct(@PathVariable int id){
        return ResponseEntity.ok(userService.findByProductId(id));
    }

    @PostMapping("/post")
    public ResponseEntity<?> ingresarUser(@RequestBody User user){
        User putUser = userService.crearUser(user);
        return ResponseEntity.ok("creado");
    }


    @PutMapping("/put/{id}")
    public ResponseEntity<?> updateUser(@PathVariable int id, @RequestBody User user){
        User userUp = userService.actualizarUser(id,user);
        return ResponseEntity.ok("Editado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        userService.eliminarUser(id);
        return ResponseEntity.ok("Eliminado");
    }




}
