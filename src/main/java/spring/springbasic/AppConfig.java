package spring.springbasic;

import spring.springbasic.discount.DiscountPolicy;
import spring.springbasic.discount.RateDiscountPolicy;
import spring.springbasic.member.MemberRepository;
import spring.springbasic.member.MemberService;
import spring.springbasic.member.MemberServiceImpl;
import spring.springbasic.member.MemoryMemberRepository;
import spring.springbasic.order.OrderService;
import spring.springbasic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
