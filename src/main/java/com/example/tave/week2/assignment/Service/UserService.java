package com.example.tave.week2.assignment.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.tave.week2.assignment.DTO.request.UserCreateRequest;
import com.example.tave.week2.assignment.Repository.UserRepository;
import com.example.tave.week2.assignment.domain.Member;

import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    /*에러메시지 반환
    *
    *
    *
    *
    *
    *
    * */
    @Transactional(readOnly = true)
    // 작업을 단위별로
    public void createUser(UserCreateRequest request){
        log.info("서비스 들어왔습니다.");
        Member user = userRepository.save(
                Member.builder()
                        .name(request.name())
                        .build()
        );
        log.info("저장이 완료되었습니다.");
    }


    @Transactional(readOnly = true)
    public Optional<Member> getUserById(Long id){ //user객체의 존재유무
        return userRepository.findById(id);
    }
}

