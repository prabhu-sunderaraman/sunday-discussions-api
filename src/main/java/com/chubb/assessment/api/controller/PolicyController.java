package com.chubb.assessment.api.controller;

import com.chubb.assessment.api.dto.response.PagedPolicyResponse;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for the {@code /api/policies} endpoints of the Policy
 * Overview Dashboard.
 *
 * <p>Outline only: declares the endpoint and its HTTP bindings mirroring the
 * OpenAPI contract. The controller stays thin and will delegate to the service
 * layer once that layer is implemented.</p>
 */
@RestController
@RequestMapping(PolicyController.BASE_PATH)
@Validated
public class PolicyController {

    static final String BASE_PATH = "/api/policies";

    private static final String PARAM_PAGE = "page";
    private static final String PARAM_SIZE = "size";
    private static final String DEFAULT_PAGE = "0";
    private static final String DEFAULT_SIZE = "10";

    @GetMapping
    public ResponseEntity<PagedPolicyResponse> getPolicies(
            @RequestParam(name = PARAM_PAGE, defaultValue = DEFAULT_PAGE) @Min(0) int page,
            @RequestParam(name = PARAM_SIZE, defaultValue = DEFAULT_SIZE) @Min(1) int size) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
