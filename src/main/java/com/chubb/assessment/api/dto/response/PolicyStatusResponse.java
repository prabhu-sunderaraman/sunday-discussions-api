package com.chubb.assessment.api.dto.response;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Human-readable policy status display value returned to the frontend.
 *
 * <p>Mirrors the {@code PolicyStatus} schema in the OpenAPI contract. The
 * stored status (e.g. ACTIVE, LAPSED) is translated into a title-cased display
 * value by the mapping layer.</p>
 */
public enum PolicyStatusResponse {

    ACTIVE("Active"),
    LAPSED("Lapsed");

    private final String displayName;

    PolicyStatusResponse(String displayName) {
        this.displayName = displayName;
    }

    @JsonValue
    public String getDisplayName() {
        return displayName;
    }
}
