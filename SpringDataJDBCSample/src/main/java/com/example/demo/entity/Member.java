package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Member 테이블 엔티티
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	public Member(Object object, String string) {
		// TODO Auto-generated constructor stub
	}
	/** Member 번호 */
	@Id
	private Integer id;
	
	/** Member 이름 */
	private String name;

}
