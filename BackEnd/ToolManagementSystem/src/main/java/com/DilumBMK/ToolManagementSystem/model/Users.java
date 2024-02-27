package com.DilumBMK.ToolManagementSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Component
@Entity
public class Users {

    @Id
    private String User_Id;
    private String Username;
    private String password;
    private String FName;
    private String LName;
    private String NIC;
    private String Position;
    private String Contact;
    private BufferedImage Pic;

}
