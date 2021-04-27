package com.webtech.what2cook.user;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Nutzer {
    @Id
    @SequenceGenerator(
            name = "nutzer_sequence",
        sequenceName = "nutzer_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "nutzer_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

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

    public Nutzer(String firstName, String lastName, String email, LocalDate dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;

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

    public int getAge(){
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
