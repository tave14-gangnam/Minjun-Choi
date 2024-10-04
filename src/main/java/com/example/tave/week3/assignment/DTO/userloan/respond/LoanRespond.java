package com.example.tave.week3.assignment.DTO.userloan.respond;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanRespond {
    private Long money;
    private String color;
}
