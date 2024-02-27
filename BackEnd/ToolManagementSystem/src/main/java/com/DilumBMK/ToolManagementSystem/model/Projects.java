package com.DilumBMK.ToolManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Component
@Entity
public class Projects {

    @Id
    private String Project_Id;
    private String Project_Name;
    private String Description;
    private String Supervisor_Name;
    private String Location;

}
