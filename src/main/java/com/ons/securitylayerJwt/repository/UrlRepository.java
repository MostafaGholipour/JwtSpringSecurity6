package com.ons.securitylayerJwt.repository;

import com.ons.securitylayerJwt.models.Url;
import com.ons.securitylayerJwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UrlRepository extends JpaRepository<Url, Integer> {
    Optional<Url> findByAccess(String access);
}
