package spring.springbasic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring.springbasic.AppConfig;
import spring.springbasic.order.OrderService;

public class MemberServiceTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();

    @Test
    void join() {
        //given 이런게 주어졌으 때
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when 이렇게 했을때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then 이렇게 된다
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
