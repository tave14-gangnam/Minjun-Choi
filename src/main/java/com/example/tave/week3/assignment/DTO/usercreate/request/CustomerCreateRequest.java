package com.example.tave.week3.assignment.DTO.usercreate.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerCreateRequest {
    private Long id;
    private Long age;
    private String name;
    private String password;
}
