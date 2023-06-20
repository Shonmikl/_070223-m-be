package org.example._2023_06_20.enums;

import lombok.Getter;

@Getter
public class Security {
    private String name;
    private Permission permissionLevel;

    public Security(String name, Permission permissionLevel) {
        this.name = name;
        this.permissionLevel = permissionLevel;
    }
}
