package com.example.tave.week3.assignment.Controller.DTO;


import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseApiResponse<T> {
    private Integer status;
    private boolean success;
    // 응답에 대한 추가 정보를 제공하는 메시지
    private String message;
    //응답데이터 설정
    private T data;

    public BaseApiResponse(String message, T data){
        this.status = HttpStatus.OK.value();
        this.success = true;
        this.message = message;
        this.data = data;
    }
}
