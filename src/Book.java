public record Book(String name, String author, Integer pageCount, Double priceBook) {
    public Book{
        if (name == null || author == null || pageCount < 0 || priceBook < 0) {
            throw new IllegalArgumentException("Invalid input values for book.");
        }

        if (name.isEmpty() || author.isEmpty()) {
            System.out.println("Warning: 'Name' and 'Author' should not be empty.");
        }

        if (pageCount <= 0) {
            System.out.println("Warning: 'PageCount' should be greater than 0.");
        }
    }

    public void displayInfo() {
        System.out.println("Book Information:\nName: " + name + "\nAuthor: " + author +
                "\nPage Count: " + pageCount + "\nPrice: " + priceBook + "\n");
    }
}
