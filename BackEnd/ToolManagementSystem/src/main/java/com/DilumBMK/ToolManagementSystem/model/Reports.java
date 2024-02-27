package com.DilumBMK.ToolManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Component
@Entity
public class Reports {

    @Id
    private String Report_Id;
    private String Report_Name;
    private String Report_Type;
    private String Report_Details;
    private LocalDate Date;

}
