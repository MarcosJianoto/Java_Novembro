public class App {
    public static void main(String[] args) throws Exception {

        String[] vect = new String[] { "Maria", "Bob", "João" };

        for (String obj : vect) {
            if (obj.equals("Maria")) {
                System.out.println(obj);
                System.out.println();
            }
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

    }
}
