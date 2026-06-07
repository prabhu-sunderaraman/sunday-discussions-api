package com.chubb.assessment.api.dto.response;

import java.math.BigDecimal;

/**
 * A monetary amount together with its ISO 4217 currency code.
 *
 * <p>Mirrors the {@code Money} schema in the OpenAPI contract.</p>
 *
 * @param amount   the monetary value
 * @param currency ISO 4217 currency code (e.g. SGD)
 */
public record MoneyResponse(
        BigDecimal amount,
        String currency) {
}
