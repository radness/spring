package com.radness.spring.repository;

import com.radness.spring.model.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

public class MemberRepositoryImplTest extends MemberRepositoryImpl {
    // Spring IoC 컨테이너가 Bean의 의존성을 주입
    @Autowired
    private MemberRepositoryImpl repository;

    // 테스트 코드를 실행한 후 저장소를 비운다.
    @AfterEach
    public void afterEach() {
        repository.clearstore();
    }

    @Test
    public void create() {
        Member member = new Member();

        member.setName("radness");
        member.setGender('M');
        member.setAge(32);
        member.setPassword("123456");
        member.setAccount("123-456-789");

//        repository.save(member);
//        Member newMember = repository.findById(member.getId()).get();

        Member newMember = repository.save(member);

        assertThat(member).isEqualTo(newMember);
    }


}
