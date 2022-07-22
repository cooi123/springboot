package com.caleb.SchoolDepartmentServer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    @NotBlank(message = "Add first name")
    private String firstName;
    @NotBlank(message = "Add last name")
    private String lastName;
    @NotBlank(message = "Add email name")
    private String emailAddress;
}
