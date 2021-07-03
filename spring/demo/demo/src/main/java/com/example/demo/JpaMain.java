package com.example.demo;

import com.example.demo.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // 엔티티 매니저 팩토리 - 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        // 엔티티 매니저 - 생성
        EntityManager em = emf.createEntityManager();
        // 트랜젝션 - 획득
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();     // 트랜젝션 - 시작
            logic(em);      // 비지니스 로직 실행
            et.commit();    // 트랜젝션 - 커밋
        } catch (Exception e) {
            et.rollback();  // 트랜젝션 - 롤백
        } finally {
            em.close();     // 엔티티 매니저 - 종료
        }
        emf.close();        // 엔티티 매니저 팩토리 - 종료
    }

    // 비지니스 로직
    private static void logic(EntityManager em) {
        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setUsername("shin");
        member.setAge(32);

        // 등록
        em.persist(member);

        // 수정
        member.setAge(20);

        // 한 건 조회\
//        Member findMember = em.find(Member.class, id);
//        System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());

        // 목록 조회
//        List<Member> members = em.createQuery("SELECT * FROM MEMBER M", Member.class).getResultList();
//        System.out.println("members.size=" + members.size());

        // 삭제
        em.remove(member);
    }
}
