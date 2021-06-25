package com.webtech.what2cook.persistence;

import javax.persistence.*;

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
    @Column(
            name ="owner",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String owner;


    public Nutzer(){
    }

    public Nutzer(Long id, String firstName, String lastName, String email, String owner){
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        this.owner = owner;
    }

    public Nutzer(String firstName, String lastName, String email, String owner){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
