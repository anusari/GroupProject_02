package com.DilumBMK.ToolManagementSystem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Component
@Entity
@Table(name = "Tools")
public class Tools {

       @Id
       @GeneratedValue(strategy = GenerationType.SEQUENCE)
       private Long tool_Id;

       private String tool_Name;
       private String description;
       private int  savedQuantity;

       @ManyToMany
       @JoinTable(
               name = "allocated_tools_mapping",
               joinColumns = @JoinColumn(name = "tool_id"),
               inverseJoinColumns = @JoinColumn(name = "allocated_tool_id")
       )
       @JsonIgnore
       Set<AllocatedTools> allocatedToolsSet = new HashSet<>();

       private byte[] Pic;

       @Column(name = "qr_Id")
       String qr_Id;

       public Long getTool_Id()
       {
              return tool_Id;
       }




}
