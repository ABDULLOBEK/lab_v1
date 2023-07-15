package com.example.entity;

import com.example.enums.SmsStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "sms_notifications")
public class SMSNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipient_phone_number")
    private String recipientPhoneNumber;

    @Column(name = "message")
    private String message;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private SmsStatus status;
}
