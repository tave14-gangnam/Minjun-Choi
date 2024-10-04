package com.example.tave.week3.assignment.Service;

import com.example.tave.week3.assignment.DTO.registerbank.request.CustomerRequest;
import com.example.tave.week3.assignment.DTO.registerbank.respond.CustomerRespond;
import com.example.tave.week3.assignment.DTO.usercreate.repond.CustomerCreateRespond;
import com.example.tave.week3.assignment.DTO.usercreate.request.CustomerCreateRequest;
import com.example.tave.week3.assignment.DTO.userloan.request.LoanRequest;
import com.example.tave.week3.assignment.DTO.userloan.respond.LoanRespond;
import com.example.tave.week3.assignment.Repository.BankRepository;
import com.example.tave.week3.assignment.Repository.CustomerRepository;
import com.example.tave.week3.assignment.domain.Bank;
import com.example.tave.week3.assignment.domain.CUSTOMER;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final BankRepository bankRepository;

    @Transactional
    public CustomerCreateRespond createCustomer(CustomerCreateRequest request) {

        Optional<CUSTOMER> certaincustomer = customerRepository.findById(request.getId());

        if (certaincustomer.isPresent()){
            throw new IllegalArgumentException("이미 가입되어 있습니다.");
        }
        CUSTOMER customer = customerRepository.save(
                CUSTOMER.builder()
                        .name(request.getName())
                        .age(request.getAge())
                        .password(request.getPassword())
                        .id(request.getId())
                        .build()
        );


        return new CustomerCreateRespond(customer.getName());
    }

    @Transactional
    public CustomerRespond registerCustomer(CustomerRequest request){

        Optional<Bank> certainbankname = bankRepository.findById(request.getId());
        if (certainbankname.isPresent()){
            throw new IllegalArgumentException("이미 가입되어 있습니다.");
        }

        Bank BANK = bankRepository.save(
                Bank.builder()
                        .id(request.getId())
                        .name(request.getName())
                        .build()
        );

        return new CustomerRespond(BANK.getId(), BANK.getName());
    }

    @Transactional
    public LoanRespond loanCustomer(LoanRequest request) {

        CUSTOMER customer = (CUSTOMER) bankRepository.findById(request.getCustomername())
                .orElseThrow(() -> new IllegalArgumentException("고객정보를 찾을 수 없습니다."));


        Bank bank = bankRepository.save(
                Bank.builder()
                        .name(request.getBankname())       // 은행 이름 설정
                        .name(request.getCustomername())               // 고객 정보 설정
                        .loan(request.getMoney())          // 대출 금액 설정
                        .build()
        );

        String color;
        if(request.getMoney() >=1000){
            color = "Red";
        }
        else {
            color="yellow";
        }
        return new LoanRespond(bank.getLoan(), color);
    }

    @Transactional
    public Optional<Bank> getCustomerById(Long id){ return bankRepository.findById(id);}

}
//


