package com.DilumBMK.ToolManagementSystem.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Component
@Entity
@Table(name = "Users")
public class Users  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_Id;

    @Column(unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fName;

    @Column(nullable = false)
    private String lName;

    @Column(nullable = false)
    private int nic;

    @ManyToOne
    @JoinColumn(name = "userTypeID")
    private UserType userTypeID;

    private int contact;

    private  byte[] pic;

    @OneToOne(mappedBy = "users")
    ToolBox toolBox;

    @OneToOne(mappedBy = "users")
    Projects projects;



}
