import controller.HandleUser;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
//        HandleUser.createUser();
        HandleUser.getUser();
    }
}
