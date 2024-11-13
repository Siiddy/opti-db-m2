package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project_task_count")
@Getter
@Setter
public class ProjectTaskCount {

    @Id
    @Column(name = "projet_id")
    private Long projetId;

    @Column(name = "projet_name")
    private String projetName;

    @Column(name = "task_count")
    private Long taskCount;
}