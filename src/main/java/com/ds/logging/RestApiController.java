package com.ds.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestApiController.class);

    @GetMapping(path = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> apiCheck() {
        LOGGER.info("===================inside API check ===================");
        LOGGER.info("This is information");
        LOGGER.debug("This is debug");
        LOGGER.error("This is error");
        LOGGER.trace("This is trace");
        LOGGER.warn("This is warning");
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .cacheControl(CacheControl.noCache())
                .body("Welcome to API Check....");
    }

}
