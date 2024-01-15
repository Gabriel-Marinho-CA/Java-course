package controller;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HandleUser {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("application");
    static EntityManager em = emf.createEntityManager();
    public static void createUser() {
        try {

            User newUser = new User("carlos", "carlos@gmail.com");

            em.getTransaction().begin();
            em.persist(newUser);
            em.getTransaction().commit();

            closeEntities();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void getUser() {
        User user = em.find(User.class,1L);
        System.out.println(user.getName());
    }


    static private void closeEntities() {
        em.close();
        emf.close();
    }

}
