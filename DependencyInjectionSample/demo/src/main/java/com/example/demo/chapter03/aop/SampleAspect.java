package com.example.demo.chapter03.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
	
	/* 메서드 실행 전에 호출하는 Before Advice 
	 * 어노테이션 인수에 포인트컷 식인 execution(반환형 패키지.클래스.메서드(인수)) 지정
	 * com.example.demo.chapter03.used 에서 클래스 이름이 Greet로 끝나는 클래스의 모든 메서드에 대해
	 * "날짜와 메서드 이름을 표시하는 어드바이스" 작성
	 * */
//    @Before("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 시작 부분 표시
        System.out.println("===== Before Advice =====");

        // 날짜를 출력
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));

        // 메서드명 출력
        System.out.println(String.format("메서드:%s", joinPoint.getSignature().getName()));
    }
    
    /* 메서드 실행 후에 호출하는 After Advice */
//    @After("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
    	// 시작 부분 표시
        System.out.println("===== After Advice =====");

        // 날짜를 출력
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));

        // 메서드명 출력
        System.out.println(String.format("메서드:%s", joinPoint.getSignature().getName()));
    }
    
    /* 메서드 실행 전후에 호출하는 Around Advice */
    @Around("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		
	  	// 시작 부분 표시
	    System.out.println("===== Around Advice =====");
	      
	    System.out.println("▼▼▼ 처리전 ▼▼▼");
	      
	    // 지정한 클래스의 메서드 실행
	    Object result = joinPoint.proceed();
	      
	    System.out.println("▲▲▲ 처리후 ▲▲▲");
	      
	    // 반환값을 돌려줄 필요가 있는 경우에는 Object 타입의 반환값을 돌려준다.
	    return result;
 	}
  
}
