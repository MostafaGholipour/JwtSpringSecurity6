package com.ons.securitylayerJwt.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)public class LoginDto {

    //it's a Data Trasfer Object for Login
    private String email ;
    private String password ;
}
