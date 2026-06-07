package com.chubb.assessment.api.dto.response;

import java.time.OffsetDateTime;

/**
 * Standard error payload returned for failures such as the policy database
 * being unreachable (503). Never exposes internal stack traces.
 *
 * <p>Mirrors the {@code ErrorResponse} schema in the OpenAPI contract.</p>
 *
 * @param timestamp when the error occurred
 * @param status    HTTP status code
 * @param error     short, human-readable error reason
 * @param message   readable, non-sensitive description of the problem
 * @param path      request path that produced the error (optional in contract)
 */
public record ErrorResponse(
        OffsetDateTime timestamp,
        int status,
        String error,
        String message,
        String path) {
}
