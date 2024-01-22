package co.sena.edu.caso_estudio.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Rol")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int id ;
    @Column(name = "description",length =20 ,nullable = false)
     private  String description_rol ;

   @ManyToMany(mappedBy = "roles")
      private List<User> users;





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_rol() {
        return description_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.description_rol = descripcion_rol;
    }


    public Role() {
    }

}
