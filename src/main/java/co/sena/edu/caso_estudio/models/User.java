package co.sena.edu.caso_estudio.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name ="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "num_doc")
    private Long num_doc;
    @Column (name = "names",length = 50,nullable=false)
    private  String names;

   @Column (name="last_names",length =60,nullable=false)
   private   String last_names ;

   @Column (name="email",length =60,nullable=false)
   private  String email;

  @ManyToMany
  @JoinTable(     name = "user_rol",
          joinColumns = @JoinColumn(name = "Usunum_doc"),
          inverseJoinColumns = @JoinColumn(name = "rol_id")
  )
  private List<Role> roles;


   /*
    @ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.MERGE)
    @JoinTable(
            name="role_user",joinColumns = @JoinColumn(name = "num_doc",referencedColumnName ="num_doc"), inverseJoinColumns=@JoinColumn(name = "roles_id",referencedColumnName = "id")


    );
   */


    public Long getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(Long num_doc) {
        this.num_doc = num_doc;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public User() {
    }


    public User(Long num_doc, String names, String last_names, String email) {
        this.num_doc = num_doc;
        this.names = names;
        this.last_names = last_names;
        this.email = email;

    }
}
