package com.helloSpring.core;

import com.helloSpring.core.member.Grade;
import com.helloSpring.core.member.Member;
import com.helloSpring.core.member.MemberService;
import com.helloSpring.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "Radness", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
