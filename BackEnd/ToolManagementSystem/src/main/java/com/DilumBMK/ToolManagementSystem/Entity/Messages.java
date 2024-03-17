package com.DilumBMK.ToolManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
@Data
@Entity
@Table(name = "Messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String messageId;
    private String description;

//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date reportDate;

    private LocalDateTime time;


}
