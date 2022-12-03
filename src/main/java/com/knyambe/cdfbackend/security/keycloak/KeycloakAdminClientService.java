package com.knyambe.cdfbackend.security.keycloak;

import com.knyambe.cdfbackend.security.User;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeycloakAdminClientService {
    @Value("${keycloak.realm}")
    public String realm;

    private final KeycloakProvider kcProvider;

    public KeycloakAdminClientService(KeycloakProvider kcProvider) {
        this.kcProvider = kcProvider;
    }
    public List<UserRepresentation> getUsers() {
        return kcProvider.getInstance().realm(realm).users().list();
    }

    public User getUser(String username) {
        List<UserRepresentation> userRepresentations = kcProvider.getInstance().realm(realm).users().search(username);
        User user = new User();
        for (UserRepresentation userRepresentation : userRepresentations) {
            mapToUser(user, userRepresentation);
        }
        return user;
    }

    private static void mapToUser(User user, UserRepresentation userRepresentation) {
        user.setId(userRepresentation.getId());
        user.setUsername(userRepresentation.getUsername());
        user.setFirstName(userRepresentation.getFirstName());
        user.setLastName(userRepresentation.getLastName());
        user.setEmail(userRepresentation.getEmail());
    }

}
