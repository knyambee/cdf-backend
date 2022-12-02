package com.knyambe.cdfbackend.security;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}
