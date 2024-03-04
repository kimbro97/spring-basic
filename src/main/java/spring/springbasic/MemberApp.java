package spring.springbasic;

import spring.springbasic.member.Grade;
import spring.springbasic.member.Member;
import spring.springbasic.member.MemberService;
import spring.springbasic.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
