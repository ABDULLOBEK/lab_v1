package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "receipts")
@Getter
@Setter
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "analysis_types")
    private String analysisTypes;

    @Column(name = "total_cost")
    private double totalCost;

    @Column(name = "qr_code")
    private String qrCode;
}
