public class App {
    public static void main(String[] args) {
        User firstUser = new User();
        System.out.println(firstUser);

        Location location = new Location("Farg'ona", "Qo'qon", 25);
        User secondUser = new User("Lazizbek", "+998991234567", location);
        System.out.println(secondUser);
    }
}
