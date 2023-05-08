package cl.coopeuch.external.database.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@ToString
@Data
public class Users {

    public Users() {

    }

    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column
    private String description;

    @Column
    private Date creationDate;

    @Column
    private boolean current;


}
