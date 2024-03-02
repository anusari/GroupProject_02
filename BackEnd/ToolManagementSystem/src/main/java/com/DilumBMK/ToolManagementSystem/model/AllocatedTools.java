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
public class AllocatedTools {

    @Id
    private String Tool_Id;
    private String ToolName;
    private int AllocatedQuantity;
    private int SavedQuantity;
    @Id
    private String ProjectId;

}
