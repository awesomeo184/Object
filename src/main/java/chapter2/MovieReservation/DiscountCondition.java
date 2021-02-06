package chapter2.MovieReservation;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
