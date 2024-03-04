package spring.springbasic.member;

public interface MemberService {
    void join(Member member);

    public Member findMember(Long memberId);
}
