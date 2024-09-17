public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "123456789", 3);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321", 2);
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.registerMember(member1);
        library.registerMember(member2);

        library.lendBook("123456789", "M001");
        library.lendBook("987654321", "M002");
        library.lendBook("987654321", "M001");
        library.lendBook("987654321", "M001");
    }
}
