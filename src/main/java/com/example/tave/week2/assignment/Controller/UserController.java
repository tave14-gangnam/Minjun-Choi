package com.example.tave.week2.assignment.Controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.example.tave.week2.assignment.Controller.dto.BaseApiResponse;
import com.example.tave.week2.assignment.DTO.request.UserCreateRequest;
import com.example.tave.week2.assignment.Service.UserService;
import com.example.tave.week2.assignment.domain.Member;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping
    public BaseApiResponse createUser(@RequestBody UserCreateRequest request) {
        log.info("시작할게요"+request.name());
        userService.createUser(request);
        log.info("출력됐습니다" );
        return new BaseApiResponse<>("유저 생성 완료", null);

    }

    @GetMapping("/{id}")
    public Optional<Member> getUserById(@PathVariable Long id){
        log.info("시작할데요"+id);
        return userService.getUserById(id);
    }
}
