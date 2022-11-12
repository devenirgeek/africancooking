package com.africancooking.backend.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class AppUser extends NaturalPerson{


    private Long id;  // id must be generated automatically when new user is created
    private String username;
    private String email;
    private String password;
    private AppUserRole appUserRole;
    private Boolean enabled; // enable is true when the E-Mail verification is done successfully
    private Boolean loggedIn;

    public AppUser(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public AppUser(String firstname, String lastname, String username, String password) {
        super(firstname, lastname);
        this.username = username;
        this.password = password;
    }

    public AppUser(String firstname, String lastname, String username, String email, String password, AppUserRole appUserRole, Boolean loggedIn, Boolean enabled) {
        super(firstname, lastname);
        this.username = username;
        this.email = email;
        this.password = password;
        this.loggedIn = loggedIn;
        this.enabled = enabled;
        this.appUserRole = appUserRole;
    }


}
