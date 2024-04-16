package com.ons.securitylayerJwt.security;

public interface SecurityService {
//    boolean isAuthenticated(String role,String url);
    boolean isAuthenticated(String user,String url);
    String getCurrentUser();
}
