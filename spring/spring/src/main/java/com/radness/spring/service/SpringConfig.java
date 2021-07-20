package com.radness.spring.service;

import com.radness.spring.repository.MemberRepository;
import com.radness.spring.repository.MemberRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    // @Bean : Spring에 Bean 등록
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository);
//    }

    // 반환형을 인터페이스 타입으로 작성 : 리포지토르 변경이 용이함
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemberRepositoryImpl();
//    }
}
