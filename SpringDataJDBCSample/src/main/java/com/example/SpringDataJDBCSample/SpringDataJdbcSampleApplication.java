package com.example.SpringDataJDBCSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;

/**
 * 스프링 부트 기동 클래스
 */
@SpringBootApplication(scanBasePackages = "com.example.demo.repository.MemberCrudRepository")
public class SpringDataJdbcSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
		.getBean(SpringDataJdbcSampleApplication.class).execute();
	}
	
	@Autowired
	MemberCrudRepository repository;
	
	/**
	 * 등록과 전체 취득 처리
	 */
	private void execute() {
		// 등록
		executeInsert();
		// 전체 취득
		executeSelect();
	}
	
	/**
	 * 등록
	 */
	private void executeInsert() {
		// 엔티티 생성(id는 자동 부여되기 때문에 null을 설정)
		Member member = new Member(null, "이순신");
		// 리포지토리를 이용해 등록을 수행하고 결과를 취득
		member = repository.save(member);
		// 결과를 표시
		System.out.println("등록 데이터:" + member);
	}

	/**
	 * 전체 취득
	 */
	private void executeSelect() {
		System.out.println("--- 전체 데이터를 취득합니다 ---");
		// 리포지토리를 이용해 전체 데이터를 취득
		Iterable<Member> members = repository.findAll();
		for (Member member : members) {
			System.out.println(member);
		}
	}

}
