package com.ons.securitylayerJwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityLayerJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityLayerJwtApplication.class, args);
    }



//    @Bean
//    CommandLineRunner run (IUserService iUserService , IRoleRepository iRoleRepository , IUserRepository iUserRepository , PasswordEncoder passwordEncoder)
//    {return  args ->
//    {   iUserService.saveRole(new Role(RoleName.USER));
//        iUserService.saveRole(new Role(RoleName.ADMIN));
//        iUserService.saveRole(new Role(RoleName.SUPERADMIN));
//        iUserService.saverUser(new User("admin@gmail.com", passwordEncoder.encode("adminPassword"), new ArrayList<>()));
//        iUserService.saverUser(new User("superadminadmin@gmail.com", passwordEncoder.encode("superadminPassword"), new ArrayList<>()));
//
//        Role role = iRoleRepository.findByRoleName(RoleName.ADMIN);
//        User user = iUserRepository.findByEmail("admin@gmail.com").orElse(null);
//        user.getRoles().add(role);
//        iUserService.saverUser(user);
//
//        User userr = iUserRepository.findByEmail("superadminadmin@gmail.com").orElse(null);
//        Role rolee = iRoleRepository.findByRoleName(RoleName.SUPERADMIN);
//        userr.getRoles().add(rolee);
//        iUserService.saverUser(userr);
//
//    };}

}

