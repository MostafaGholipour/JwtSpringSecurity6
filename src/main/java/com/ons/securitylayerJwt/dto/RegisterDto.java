package com.ons.securitylayerJwt.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;


@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterDto implements Serializable {

    //it's a Data Trasfer Object for registration
    String firstName ;
    String lastName ;
    String email;
    String password ;
}
