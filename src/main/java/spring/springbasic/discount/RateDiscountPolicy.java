package spring.springbasic.discount;

import org.springframework.stereotype.Component;
import spring.springbasic.member.Member;
@Component
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
