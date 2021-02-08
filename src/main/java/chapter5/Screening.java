package chapter5;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
        return null;
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateFee(this).times(audienceCount);
    }

}
