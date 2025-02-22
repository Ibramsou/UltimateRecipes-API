package com.ultimaterecipes.api;

public interface UrAPI {

    static UrAPI get() {
        return UrApiService.getAPI();
    }
}
