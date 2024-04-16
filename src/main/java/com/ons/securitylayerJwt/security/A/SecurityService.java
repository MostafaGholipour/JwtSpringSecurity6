package com.ons.securitylayerJwt.security.A;

public interface SecurityService {
//    boolean isAuthenticated(String role,String url);
    boolean isAuthenticated(String user,String url);
    String getCurrentUser();
}
