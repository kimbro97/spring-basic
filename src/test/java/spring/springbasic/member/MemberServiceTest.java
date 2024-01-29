package spring.springbasic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring.springbasic.AppConfig;

public class MemberServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    @Test
    void join() {
        Member kimbro = new Member(1L, "kimbro", Grade.VIP);
        memberService.join(kimbro);
        Member member = memberService.findMember(1L);
        Assertions.assertThat(kimbro).isEqualTo(member);
    }
    @Test
    void findMember() {
        Member kimbro = new Member(1L, "kimbro", Grade.VIP);
        memberService.join(kimbro);
        Member member = memberService.findMember(1L);
        Assertions.assertThat(kimbro.getId()).isEqualTo(member.getId());
    }
}
