package com.example.multipledatasources.model.address;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "empid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @Column(name = "empname", nullable = false)
    private String empName;

    @Column(name = "empaddress", nullable = false)
    private String empAddress;

    @Column(name = "emppincode", nullable = false)
    private String empPinCode;

}
