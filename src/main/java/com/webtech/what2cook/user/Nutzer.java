package com.webtech.what2cook.user;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Nutzer")
@Table(
        name = "nutzer",
        uniqueConstraints = {
                @UniqueConstraint(name = "nutzer_email_unique", columnNames = "email")
        }
)
public class Nutzer {
    @Id
    @SequenceGenerator(
            name = "nutzer_sequence",
        sequenceName = "nutzer_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
            strategy =  SEQUENCE,
            generator = "nutzer_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name ="first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            name ="last_name",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String lastName;
    @Column(
            name ="email",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String email;


    public Nutzer(){
    }

    public Nutzer(Long id, String firstName, String lastName, String email){
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public Nutzer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
