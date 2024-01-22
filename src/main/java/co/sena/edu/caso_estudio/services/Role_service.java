package co.sena.edu.caso_estudio.services;

import co.sena.edu.caso_estudio.models.Role;
import co.sena.edu.caso_estudio.repositories.Role_interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Role_service {
    @Autowired
    Role_interface role_i;
   public ArrayList<Role>getRoles(){
     return  (ArrayList<Role>)
             role_i.findAll();

   }
}
