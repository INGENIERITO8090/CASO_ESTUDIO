package co.sena.edu.caso_estudio.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_interface extends CrudRepository<co.sena.edu.caso_estudio.models.User,Integer> {
}
