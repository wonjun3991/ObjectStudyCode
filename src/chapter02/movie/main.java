package chapter02.movie;

import chapter02.movie.pricing.AmountDiscountPolicy;

public class main {
    public testAmountDeliveryPolicy() {
        //give
        Money discountAmount = new Money(500);
        SequenceCondition sequenceCondition = new SequenceCondition(1);

        AmountDiscountPolicy amountDiscountPolicy = new AmountDiscountPolicy(discountAmount, sequenceCondition);
        Screening screening = new Screening(new Movie(), 1, '123123');

        //when
        Money expected =  amountDiscountPolicy.calculateDiscountAmount(screening);

        //then
        assert(expected, 500);
    }
}
