package spring.springbasic.discount;

import spring.springbasic.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private final int DISCOUNT_PERCENT = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.isVipGrade()) {
            return price * DISCOUNT_PERCENT / 100;
        }
        return 0;
    }
}
