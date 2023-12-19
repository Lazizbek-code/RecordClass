public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Programming", "John Smith", 300, 29.99);
        book1.displayInfo();

        try {
            Book book2 = new Book("", "Jane Doe ", -50, 19.99);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Book book3 = new Book(null, null, 0, 9.99);
        book3.displayInfo();

    }
}
