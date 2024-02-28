package spring.springbasic.discount;

import org.springframework.stereotype.Component;
import spring.springbasic.member.Member;

@Component
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
