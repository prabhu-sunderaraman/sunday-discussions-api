package com.chubb.assessment.api.dto.response;

import java.time.LocalDate;

/**
 * A single policy as presented on the dashboard list.
 *
 * <p>Mirrors the {@code PolicySummary} schema in the OpenAPI contract.</p>
 *
 * @param policyNumber   unique policy identifier
 * @param holderName     full name of the policy holder
 * @param region         region display name
 * @param status         policy status display value
 * @param premium        premium amount with currency
 * @param startDate      policy start date
 * @param endDate        policy end date
 * @param isExpiringSoon true when the end date is within 30 days from today
 */
public record PolicySummaryResponse(
        String policyNumber,
        String holderName,
        RegionResponse region,
        PolicyStatusResponse status,
        MoneyResponse premium,
        LocalDate startDate,
        LocalDate endDate,
        boolean isExpiringSoon) {
}
