package spring.springbasic.discount;

import org.springframework.stereotype.Component;
import spring.springbasic.member.Member;
@Component
public class RateDiscountPolicy implements DiscountPolicy {
    private static final int DISCOUNT_PERCENT = 10;
    private static final int DISCOUNT_ZERO_AMOUNT = 0;
    @Override
    public int discount(Member member, int price) {
        if (member.isVip()) {
            return price * DISCOUNT_PERCENT / 100;
        }
        return DISCOUNT_ZERO_AMOUNT;
    }
}
