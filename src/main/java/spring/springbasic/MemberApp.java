package spring.springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.springbasic.member.Grade;
import spring.springbasic.member.Member;
import spring.springbasic.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member kimbro97 = new Member(1L, "kimbro97", Grade.VIP);
        memberService.join(kimbro97);
        Member findMember = memberService.findMember(1L);
        System.out.println(kimbro97);
        System.out.println(findMember);
    }
}
