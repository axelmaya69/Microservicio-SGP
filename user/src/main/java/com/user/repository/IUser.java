package com.user.repository;

import com.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUser extends JpaRepository<User,Integer> {

    List<User> findAllByProductoId(int id_producto);


}
