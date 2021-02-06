import chapter2.MovieReservation.AmountDiscountPolicy;
import chapter2.MovieReservation.DiscountPolicy;
import chapter2.MovieReservation.Money;
import chapter2.MovieReservation.Movie;
import chapter2.MovieReservation.PercentDiscountPolicy;
import chapter2.MovieReservation.PeriodCondition;
import chapter2.MovieReservation.SequenceCondition;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    @DisplayName("영화 인스턴스 생성")
    void movieTest() {
        Movie avatar = new Movie("아바타",
            Duration.ofMinutes(120),
            Money.wons(10000),
            new AmountDiscountPolicy(Money.wons(800),
                new SequenceCondition(1),
                new SequenceCondition(10),
                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0),
                    LocalTime.of(20, 59))));

        Movie titanic = new Movie("타이타닉",
            Duration.ofMinutes(180),
            Money.wons(11000),
            new PercentDiscountPolicy(0.1,
                new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                new SequenceCondition(2),
                new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0),
                    LocalTime.of(13, 59))));
    }

}
