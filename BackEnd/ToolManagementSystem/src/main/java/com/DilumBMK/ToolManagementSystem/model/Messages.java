package com.DilumBMK.ToolManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
@Data
@Entity
public class Messages {

    @Id
    private String MessageId;
    private String Description;
    private Date Date;

}
