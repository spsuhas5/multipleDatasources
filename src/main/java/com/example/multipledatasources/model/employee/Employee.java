package com.example.multipledatasources.model.employee;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "empid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @Column(name = "empname", nullable = false)
    private String empName;

    @Column(name = "empaddress", nullable = false)
    private String empAddress;

    @Column(name = "empemail", nullable = false)
    private String empEmail;

}
