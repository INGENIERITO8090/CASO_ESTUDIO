package co.sena.edu.caso_estudio.controllers;
import co.sena.edu.caso_estudio.models.Role;
import co.sena.edu.caso_estudio.services.Role_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
@RequestMapping("/roles")
public class Role_controller {
@Autowired
    Role_service role_service;
@GetMapping()
    public ArrayList<Role> getRoles(){
    return  role_service.getRoles();
}
}
