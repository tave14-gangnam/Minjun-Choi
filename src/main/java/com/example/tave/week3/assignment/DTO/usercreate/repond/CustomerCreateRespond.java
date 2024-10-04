package com.example.tave.week3.assignment.DTO.usercreate.repond;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerCreateRespond {
    private String name;


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
