package com.chubb.assessment.api.dto.response;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RegionResponse {

    SINGAPORE("Singapore"),
    HONG_KONG("Hong Kong"),
    AUSTRALIA("Australia"),
    INDIA("India"),
    JAPAN("Japan");

    private final String displayName;

    RegionResponse(String displayName) {
        this.displayName = displayName;
    }

    @JsonValue
    public String getDisplayName() {
        return displayName;
    }
}
