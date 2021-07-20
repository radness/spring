package com.radness.spring.controller;

import com.radness.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberControllerImpl implements MemberController {

    private MemberService memberService;

    @Autowired
    public MemberControllerImpl(MemberService memberService) {
        this.memberService = memberService;
    }
}
