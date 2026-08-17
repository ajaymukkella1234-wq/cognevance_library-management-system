// Main.java
class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Java", "James"));
        library.addBook(new Book(2, "DSA", "Mark"));

        library.viewBooks();
    }
}
