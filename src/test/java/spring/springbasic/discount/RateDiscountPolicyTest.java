package spring.springbasic.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring.springbasic.AppConfig;
import spring.springbasic.member.Grade;
import spring.springbasic.member.Member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    AppConfig appConfig = new AppConfig();
    DiscountPolicy discountPolicy = appConfig.discountPolicy();
    @Test
    void discount() {
        Member kimbro = new Member(1L, "kimbro", Grade.VIP);
        int discountPrice = discountPolicy.discount(kimbro, 10000);
        assertThat(discountPrice).isEqualTo(1000);
    }

    @DisplayName("VIP가 아닌경우 할인이 적용되면 안된다")
    @Test
    void discount_x() {
        Member kimbro = new Member(1L, "kimbro", Grade.BASIC);
        int discountPrice = discountPolicy.discount(kimbro, 10000);
        assertThat(discountPrice).isEqualTo(0);
    }
}