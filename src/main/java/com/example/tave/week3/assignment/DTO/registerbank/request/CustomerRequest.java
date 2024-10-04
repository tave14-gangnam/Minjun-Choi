package com.example.tave.week3.assignment.DTO.registerbank.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {
    private Long id;
    private String name;
}
