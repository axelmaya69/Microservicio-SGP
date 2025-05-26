package com.user.service;

import com.user.entity.User;
import com.user.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements IUserService{

    @Autowired
    IUser Auser;

    @Override
    public User crearUser(User user) {
        return Auser.save(user);
    }

    @Override
    public User obtenerUser(int id) {
        return Auser.findById(id).orElseThrow();
    }

    @Override
    public List<User> obtenerUsers() {
        return Auser.findAll();
    }

    @Override
    public List<User> findByProductId(int id) {
        return Auser.findAllByProductoId(id);
    }

    @Override
    public User actualizarUser(int id, User user) {
        User updateUser = Auser.findById(id).get();
        if(Auser.existsById(id)){
            updateUser.setNombre(user.getNombre());
            updateUser.setApellidoP(user.getApellidoP());
            updateUser.setApellidoM(user.getApellidoM());
            updateUser.setEmail(user.getEmail());
            return Auser.save(updateUser);
        }
        return null;
    }

    @Override
    public void eliminarUser(int id) {
    Auser.deleteById(id);
    }
}
