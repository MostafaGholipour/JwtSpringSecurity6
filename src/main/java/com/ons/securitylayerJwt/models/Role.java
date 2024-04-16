package com.ons.securitylayerJwt.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role implements Serializable  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    @Enumerated(EnumType.STRING)
    RoleName roleName ;
    @ManyToMany(fetch = FetchType.EAGER  , cascade = CascadeType.PERSIST)
    List<Url> urls;

    public Role (RoleName roleName) {this.roleName = roleName;}
    public String getRoleName() {
        return roleName.toString();
    }
}
