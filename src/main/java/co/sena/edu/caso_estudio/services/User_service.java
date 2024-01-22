package co.sena.edu.caso_estudio.services;

import co.sena.edu.caso_estudio.models.User;
import co.sena.edu.caso_estudio.repositories.User_interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class User_service {
@Autowired
User_interface user;
public ArrayList<User> getUsers(){
    return (ArrayList<User>)
       user.findAll();
}
public  User saveUser (User user1){
    return user.save(user1);
}
}
