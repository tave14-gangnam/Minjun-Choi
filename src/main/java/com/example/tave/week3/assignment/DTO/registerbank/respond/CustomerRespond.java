package com.example.tave.week3.assignment.DTO.registerbank.respond;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRespond {
    private Long id;
    private String name;
}
