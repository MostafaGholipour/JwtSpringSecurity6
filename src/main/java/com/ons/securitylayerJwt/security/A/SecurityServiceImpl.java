package com.ons.securitylayerJwt.security.A;

import com.ons.securitylayerJwt.models.Url;
import com.ons.securitylayerJwt.models.User;
import com.ons.securitylayerJwt.repository.UserRepository;
import com.ons.securitylayerJwt.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("SecurityServiceImpel")
public class SecurityServiceImpl implements com.ons.securitylayerJwt.security.A.SecurityService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UrlRepository urlRepository;

    @Override
    public boolean isAuthenticated(String username, String url) {
        User user = userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("Not Found"));
        Url access = urlRepository.findByAccess(url).orElseThrow(() -> new RuntimeException("Not Found Url"));

        List<Url> urls = new ArrayList<>();
        user.getRoles().forEach(r->urls.addAll(r.getUrls()));
        urls.addAll(user.getUrls());
        System.out.println("List Size : "+urls.size());
       return urls.contains(access);
    }

    @Override
    public String getCurrentUser() {
        return SecurityContextHolder
                .getContext()
                .getAuthentication().getName();
    }
}
