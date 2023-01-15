package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Member;

/**
 * Member 테이블 : 리포지토리
 */
@Component
public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
