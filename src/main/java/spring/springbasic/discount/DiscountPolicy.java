package spring.springbasic.discount;

import spring.springbasic.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
