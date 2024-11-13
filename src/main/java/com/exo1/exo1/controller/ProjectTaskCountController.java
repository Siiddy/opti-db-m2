package com.exo1.exo1.controller;

import com.exo1.exo1.entity.ProjectTaskCount;
import com.exo1.exo1.service.ProjectTaskCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project-task-count")
public class ProjectTaskCountController {

    @Autowired
    private ProjectTaskCountService service;

    @GetMapping
    public ResponseEntity<List<ProjectTaskCount>> getTaskCountsByProject() {
        return ResponseEntity.ok(service.getTaskCountsByProject());
    }
}