package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id

    private int empId;

    private String empName;

    private String empAddress;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    private Date empDOB;

    private int deptId;
}
