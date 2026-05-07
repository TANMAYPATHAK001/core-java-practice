package basics;

public class Aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship b/w objects
        //             One object contains another object as a part of its structure
        //             but the contained object/s can exist independently


        Book book1 = new Book("Death", 376);
        Book book2 = new Book("Apprenticed to a Himalayan Master", 461);
        Book book3 = new Book("Osho's biography", 1308);

        Book[] books = {book1, book2, book3};

        Library library = new Library("The Reading Room", 2026, books);

        library.displayInfo();

//        for(Book book: books){
//            System.out.println(book.displayInfo());
//        }

    }
}
