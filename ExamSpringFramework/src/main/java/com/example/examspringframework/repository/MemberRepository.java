package com.example.examspringframework.repository;
import com.example.examspringframework.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<Member, String> {
}
