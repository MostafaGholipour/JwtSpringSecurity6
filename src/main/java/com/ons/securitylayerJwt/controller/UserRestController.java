package com.ons.securitylayerJwt.controller;



import com.ons.securitylayerJwt.dto.LoginDto;
import com.ons.securitylayerJwt.dto.RegisterDto;
import com.ons.securitylayerJwt.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {


    private final UserServiceImpl userServiceImpl;

    //RessourceEndPoint:http://localhost:8087/api/user/register
    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody RegisterDto registerDto)
    { return  userServiceImpl.register(registerDto);}

    //RessourceEndPoint:http://localhost:8087/api/user/authenticate
    @PostMapping("/authenticate")
    public String authenticate(@RequestBody LoginDto loginDto)
    { return  userServiceImpl.authenticate(loginDto);}



}
