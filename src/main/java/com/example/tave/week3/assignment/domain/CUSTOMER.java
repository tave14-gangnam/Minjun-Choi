package com.example.tave.week3.assignment.domain;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class CUSTOMER {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    private Long age;
    private String name;
    @Column(length = 15)
    private String password;

    @OneToMany(mappedBy = "customer")
    private List<Bank> banks = new ArrayList();

    @Builder
    public CUSTOMER(Long id, Long age, String password){
        this.id=id;
        this.age=age;
        this.password=password;
    }

}
