package com.example.tave.week3.assignment.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bank_id")
    private Long id;
    private String name;
    private Long savings;
    private Long loan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CUSTOMER customer;

    @Builder
    public Bank(Long id, String name, Long savings, Long loan){
        this.id = id;
        this.name=name;
        this.savings=savings;
        this.loan=loan;
    }

}
