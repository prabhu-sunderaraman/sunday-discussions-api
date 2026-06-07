package com.chubb.assessment.api.dto.response;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Human-readable region display name returned to the frontend.
 *
 * <p>Mirrors the {@code Region} schema in the OpenAPI contract. The stored
 * region code (SG, HK, AU, IN, JP) is translated into one of these display
 * values by the mapping layer.</p>
 */
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
