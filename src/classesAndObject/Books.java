package classesAndObject;

public class Books {
    String name;
    String author;
    String genre;
    int year;
    int price;

    public Books(String name, String author, String genre, int year, int price){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public Books(String name, String author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public Books() {

    }

    public void printBooks(){
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Year Published: " + year);
        System.out.println("Price: " + price + "$");
        System.out.println("----------------------");

    }
}
