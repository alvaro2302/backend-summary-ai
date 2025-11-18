package com.summary_ai.web.controller;

import com.summary_ai.persistence.entity.RecordEntity;
import com.summary_ai.persistence.repository.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recordings/start")
public class RecordController {
    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping
    public ResponseEntity<RecordEntity> add(@RequestBody RecordEntity record) {
        return ResponseEntity.ok(this.recordService.add(record));
    }
}
