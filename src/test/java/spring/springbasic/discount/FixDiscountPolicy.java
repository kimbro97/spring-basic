package spring.springbasic.discount;

import spring.springbasic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private final int DISCOUNT_FIX_AMOUNT = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.isVipGrade()) {
            return DISCOUNT_FIX_AMOUNT;
        }
        return 0;
    }
}
