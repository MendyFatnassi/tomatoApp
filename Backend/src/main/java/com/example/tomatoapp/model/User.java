package com.example.tomatoapp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;
}
