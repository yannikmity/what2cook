//package com.webtech.what2cook.config;
//
//import com.google.common.collect.Sets;
//
//import java.util.Set;
//
//import static com.webtech.what2cook.config.ApplicationUserPermission.*;
//
//public enum ApplicationUserRole {
//
//    NUTZER(Sets.newHashSet(REZEPT_READ, REZEPT_WRITE)),
//    ADMIN(Sets.newHashSet(REZEPT_READ, REZEPT_WRITE, NUTZER_READ, NUTZER_WRITE)),
//    ADMINZWEI(Sets.newHashSet(REZEPT_READ, NUTZER_READ));
//
//    private final Set<ApplicationUserPermission> permissions;
//
//
//    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
//        this.permissions = permissions;
//    }
//
//    public Set<ApplicationUserPermission> getPermissions() {
//        return permissions;
//    }
//}
