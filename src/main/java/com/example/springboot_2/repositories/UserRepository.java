package com.example.springboot_2.repositories;

import com.example.springboot_2.Authorities;

import java.util.LinkedList;
import java.util.List;

public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new LinkedList<>();

        // Some logic to get users and check credentials
        if (user.equals("ruslan") && password.equals("123")) {
            list.add(Authorities.READ);
            list.add(Authorities.WRITE);
            list.add(Authorities.DELETE);
        }

        if (user.equals("ivan") && password.equals("321")) {
            list.add(Authorities.READ);
        }

        return list;
    }
}
