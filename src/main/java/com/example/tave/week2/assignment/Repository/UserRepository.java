package com.example.tave.week2.assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tave.week2.assignment.domain.Member;

public interface UserRepository extends JpaRepository<Member, Long> {
}
