package com.lucas.security.util;

import java.util.Arrays;
import java.util.List;

public enum Role {
    CUSTOMER(Arrays.asList(Permission.READE_ONLY)),
    ADMIN(Arrays.asList(Permission.READE_ONLY, Permission.MODIFY_ONLY));

    private List<Permission> permissions;

    Role(List<Permission> permissions){
        this.permissions = permissions;
    }

    public List<Permission> getPermissions(){
        return permissions;
    }
    public void setPermissions(List<Permission> permissions){
        this.permissions = permissions;
    }
}
