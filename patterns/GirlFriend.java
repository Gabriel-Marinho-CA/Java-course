package nelioAlves.course.patterns;

public class GirlFriend implements ArrivedObserver{


    @Override
    public void arrived(EventBirthDayBoyArrived event) {
        System.out.println("Warning guests...");
        System.out.println("Turn off lights...");
        System.out.println("Waiting...");
        System.out.println("SURPRISE !!!");
    }
}
