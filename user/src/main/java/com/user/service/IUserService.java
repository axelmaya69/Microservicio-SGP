package com.user.service;

import com.user.entity.User;

import java.util.List;

public interface IUserService {

    User crearUser (User user);

    User obtenerUser(int id);

    List<User> obtenerUsers();

    List<User> findByProductId(int id);

    User actualizarUser(int id, User user);

    void eliminarUser (int id);


}
