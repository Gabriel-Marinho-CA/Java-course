package nelioAlves.course.DataStructs;

public class Equals_obj {
    public static void main(String[] args) {
        User u1 = new User("Pedro Silva", "pedro.silva@ksadop.com");

        User u2 = new User("Pedro Silva", "pedro.silva@ksadop.com");


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1);

    }

    public static class User {
        public String nome;
        public String email;

        @Override
        public boolean equals(Object obj) {

            if (obj instanceof User) {
                User outro = (User) obj;

                boolean nomeIgual = outro.nome.equals(this.nome);
                boolean emailIgual = outro.email.equals(this.email);


                return nomeIgual && emailIgual;
            } else {
                return false;
            }
        }

        public User(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }
    }
}
