package classesAndObject;

public class BooksMain {
    public static void main(String[] args) {

        Books books = new Books("Good to Great", "Jim Collins", "Non-Fiction", 2023, 20 );
        Books books1 = new Books("Rich Dad Poor Dad", "Robert Kiyoski", "Non-Fiction", 2014);
        Books books3 = new Books();
        books1.printBooks();
        books.printBooks();
        books3.printBooks();
    }
}
