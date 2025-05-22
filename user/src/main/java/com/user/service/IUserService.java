package com.user.service;

import com.user.entity.User;

import java.util.List;

public interface IUserService {

    User crearUser (User user);

    User obtenerUser(int id);

    List<User> obtenerUsers();

    User actualizarUser(int id, User user);

    void eliminarUser (int id);


}
