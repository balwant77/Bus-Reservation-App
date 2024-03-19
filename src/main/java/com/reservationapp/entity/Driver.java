package com.reservationapp.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String licenseNumber;
    private String aadharNumber;
    private String address;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailId;

    @OneToOne
    @JoinColumn(name="bus_id")
    private Bus bus;


}
