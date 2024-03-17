package com.DilumBMK.ToolManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Component
@Entity
@Table(name = "Projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_Id;
    private String project_Name;
    private String description;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supervisor_id", referencedColumnName = "user_Id")
    Users users;

    @OneToOne(mappedBy = "projects")
    private ToolBox toolBox;

    @ManyToOne
    @JoinColumn(name = "location_Id")
    private Location location;


}
