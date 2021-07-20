package com.radness.spring.service;

import com.radness.spring.model.Member;
import com.radness.spring.repository.MemberRepository;
import com.radness.spring.repository.MemberRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    // 서비스를 만들려면 리포지토리가 필요하므로 맴버변수 선언
    private MemberRepository memberRepository;

    // 리포지토리를 직접 new 키워드로 생성하지 않고, 외부에서 주입하도록 구현(DI)
    @Autowired
    public MemberService(MemberRepositoryImpl memberRepository) {
        this.memberRepository = memberRepository;
    }
}
