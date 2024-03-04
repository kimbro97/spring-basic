package spring.springbasic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring.springbasic.AppConfig;

public class MemberServiceTest {


    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    @Test
    void join() {
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member.getId()).isEqualTo(findMember.getId());
    }
}
