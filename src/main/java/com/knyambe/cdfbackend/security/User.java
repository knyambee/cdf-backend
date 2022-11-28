package com.knyambe.cdfbackend.security.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    private String id;

    private String username;

    private String firstName;

    private String lastName;

    private Date birthDate;

    public User(String id) {
        this.id = id;
    }
}
