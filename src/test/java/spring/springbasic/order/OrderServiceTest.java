package spring.springbasic.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring.springbasic.AppConfig;
import spring.springbasic.member.*;

public class OrderServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();

    @Test
    void createOrder() {
        Member vipMember = new Member(1L, "kimbro", Grade.VIP);
        memberService.join(vipMember);
        Order order = orderService.createOrder(1L, "상품", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
