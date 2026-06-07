package com.chubb.assessment.api.dto.response;

import java.util.List;

/**
 * Paginated list of policies, shaped for server-side pagination in an Angular
 * Material table.
 *
 * <p>Mirrors the {@code PagedPolicyResponse} schema in the OpenAPI contract.</p>
 *
 * @param content       the policies on the current page
 * @param page          zero-based index of the current page
 * @param size          maximum number of records per page
 * @param totalElements total number of policies across all pages
 * @param totalPages    total number of pages available
 */
public record PagedPolicyResponse(
        List<PolicySummaryResponse> content,
        int page,
        int size,
        long totalElements,
        int totalPages) {
}
