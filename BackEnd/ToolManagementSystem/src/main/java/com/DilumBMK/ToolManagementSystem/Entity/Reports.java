package com.DilumBMK.ToolManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "Reports")
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String report_Id;
    private String report_Name;
    private String Report_Details;

    /*@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP) // Specify TemporalType for Timestamp field
    @Column(name = "createdDate", nullable = false, updatable = false)
    private Timestamp createdDate;*/

    private LocalDateTime timestamp;

    @Column(name = "reportTypeID")
   private String reportTypeID;

}
