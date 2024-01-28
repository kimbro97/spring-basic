package spring.springbasic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
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
