package com.ultimaterecipes.api;

import java.util.ServiceLoader;

public class UrApiService {

    private static final UrAPI API;

    protected static UrAPI getAPI() {
        return API;
    }

    static {
        ServiceLoader<UrAPI> loader = ServiceLoader.load(UrAPI.class);
        if (loader.iterator().hasNext()) {
            API = loader.iterator().next();
        } else {
            throw new IllegalArgumentException("No UrAPI found");
        }
    }
}
