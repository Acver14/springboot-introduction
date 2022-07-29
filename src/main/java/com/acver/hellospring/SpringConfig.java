package com.acver.hellospring;

import com.acver.hellospring.domain.Member;
import com.acver.hellospring.repository.MemberRepository;
import com.acver.hellospring.repository.MemoryMemberRepository;
import com.acver.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
