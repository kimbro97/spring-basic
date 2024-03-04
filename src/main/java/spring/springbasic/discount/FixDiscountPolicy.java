package spring.springbasic.discount;

import spring.springbasic.member.Grade;
import spring.springbasic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private static final int DISCOUNT_FIX_AMOUNT = 1000;
    private static final int DISCOUNT_ZERO_AMOUNT = 0;
    @Override
    public int discount(Member member, int price) {
        if (member.isVip()) {
            return DISCOUNT_FIX_AMOUNT;
        }
        return DISCOUNT_ZERO_AMOUNT;
    }
}
