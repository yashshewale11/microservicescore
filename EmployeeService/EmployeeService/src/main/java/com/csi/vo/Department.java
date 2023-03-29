package com.csi.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {


    private int depId;

    private String deptName;

    private String deptCode;
}
