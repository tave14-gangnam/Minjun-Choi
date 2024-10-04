package com.example.tave.week3.assignment.DTO.userloan.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanRequest {
    private String  customername;
    private String  bankname;
    private Long money;
}
