package br.com.peoplemanagement.model;


import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, unique = true, nullable = false)
    private UUID UID;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "BIRTH_DATE")
    private Date birthData;

    public UUID getUID() {
        return UID;
    }

    public void setUID(UUID UID) {
        this.UID = UID;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthData() {
        return birthData;
    }

    public void setBirthData(Date birthData) {
        this.birthData = birthData;
    }
}
