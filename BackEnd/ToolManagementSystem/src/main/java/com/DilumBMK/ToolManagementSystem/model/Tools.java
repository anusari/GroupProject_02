package com.DilumBMK.ToolManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Component
@Entity
public class Tools {

       @Id
       private String Tool_Id;
       private String Tool_Name;
       private String Description;
       private int Quantity;
       private BufferedImage Pic;

}
