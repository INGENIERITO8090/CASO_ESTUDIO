package co.sena.edu.caso_estudio.controllers;
import co.sena.edu.caso_estudio.models.User;
import co.sena.edu.caso_estudio.services.User_service;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class User_controller {
    @Autowired
    User_service user_s ;
    @GetMapping()
     public ArrayList<User> getUsers () {
        return  user_s.getUsers();
    }
    @PostMapping()
    public  User saveUser(@RequestBody User use){
        return  this.user_s.saveUser(use);
    }






}
