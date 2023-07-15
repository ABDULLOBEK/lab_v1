package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "analysis_results")
@Getter
@Setter
public class AnalysisResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "analysis_type_id")
    private AnalysisType analysisType;

    @Column(name = "test_date")
    private LocalDate testDate;

    @Column(name = "result_data")
    private String resultData;
}
