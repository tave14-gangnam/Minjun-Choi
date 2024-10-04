package com.example.tave.week3.assignment.Controller;


import com.example.tave.week2.assignment.domain.Member;
import com.example.tave.week3.assignment.Controller.DTO.BaseApiResponse;
import com.example.tave.week3.assignment.DTO.customerget.respond.CustomerGetRespond;
import com.example.tave.week3.assignment.DTO.registerbank.request.CustomerRequest;
import com.example.tave.week3.assignment.DTO.registerbank.respond.CustomerRespond;
import com.example.tave.week3.assignment.DTO.usercreate.repond.CustomerCreateRespond;
import com.example.tave.week3.assignment.DTO.usercreate.request.CustomerCreateRequest;
import com.example.tave.week3.assignment.DTO.userloan.request.LoanRequest;
import com.example.tave.week3.assignment.DTO.userloan.respond.LoanRespond;
import com.example.tave.week3.assignment.Service.CustomerService;
import com.example.tave.week3.assignment.domain.Bank;
import com.example.tave.week3.assignment.domain.CUSTOMER;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerService customerService;


    @PostMapping("/customers")
    public BaseApiResponse<CustomerCreateRespond> createCustomer(@RequestBody CustomerCreateRequest request){

        CustomerCreateRespond response = customerService.createCustomer(request);


        String message = response.getName()+"가 등록되었습니다. " ;


        return new BaseApiResponse<>(message, response);
    }

    @PostMapping("/customers")

    public void registerBank(@RequestBody CustomerRequest request){
        CustomerRespond response = customerService.registerCustomer(request);

        String message = response.getName() +"에" +response.getId()+"가 등록되었습니다.";

        log.info(message);
    }

    @PostMapping("/id/loan")
    public void userLoan(@RequestBody LoanRequest request){
        LoanRespond response = customerService.loanCustomer(request);

        String message = response.getColor()+"에"+response.getMoney();

        log.info(message);
    }

    @GetMapping("/api")
    public Optional<Bank> userGet(@RequestParam(name = "id") Long id) {
        return customerService.getCustomerById(id);
    }


}


