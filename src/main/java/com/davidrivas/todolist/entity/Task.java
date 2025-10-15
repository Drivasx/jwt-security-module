package com.davidrivas.todolist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private User user;

    @Column(name = "nameTask", nullable = false, length = 100)
    private String nameTask;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    @Column(name = "deadline", nullable = false)
    private LocalDate deadline;

}