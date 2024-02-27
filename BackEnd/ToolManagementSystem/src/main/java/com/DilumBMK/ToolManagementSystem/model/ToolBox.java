package com.DilumBMK.ToolManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Component
@Entity
public class ToolBox {

    @Id
    private String QR_Id;
    private String Project_Id;
    private String Project_Name;
    private String SiteSupervisor_Id;
    private String SiteSupervisor_Name;
    private String Tool_Details;
    private String Location;

}
