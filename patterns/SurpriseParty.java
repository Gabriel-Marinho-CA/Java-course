package nelioAlves.course.patterns;

public class SurpriseParty {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        ObserverOfParty observerOfParty = new ObserverOfParty();

        observerOfParty.registerObserver(girlFriend);
        observerOfParty.registerObserver(e-> System.out.println("The momment: "+ e.getMomment()));
        observerOfParty.monitoring();
    }
}
