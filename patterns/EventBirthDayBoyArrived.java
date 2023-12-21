package nelioAlves.course.patterns;

import java.util.Date;

public class EventBirthDayBoyArrived {
    private final Date momment;

    public EventBirthDayBoyArrived(Date momment) {
        this.momment = momment;
    }

    public Date getMomment() {
        return momment;
    }

}
