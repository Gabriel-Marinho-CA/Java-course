package nelioAlves.course.patterns;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ObserverOfParty {
    private List<ArrivedObserver> observers = new ArrayList<>();

    public void registerObserver(ArrivedObserver ob) {
        observers.add(ob);
    }

    public void monitoring() {
        Scanner sc = new Scanner(System.in);

        String value ="";

        while(!"exit".equalsIgnoreCase(value)) {
            System.out.print("Birth boy arrived?");
            value = sc.nextLine();

            if("yes".equalsIgnoreCase(value)) {
                EventBirthDayBoyArrived event = new EventBirthDayBoyArrived(new Date());
                observers.stream()
                        .forEach(obs -> obs.arrived(event));

                value = "exit";
            } else {
                System.out.println("False Alarm");
            }
        }

        sc.close();
    }
}
