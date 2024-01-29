package spring.springbasic.order;

import spring.springbasic.discount.DiscountPolicy;
import spring.springbasic.discount.FixDiscountPolicy;
import spring.springbasic.member.Member;
import spring.springbasic.member.MemberRepository;
import spring.springbasic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
