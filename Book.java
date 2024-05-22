/* Imagine you're developing a bookstore application in Java. You're tasked with implementing a feature that  allows users to create a wishlist of books they want to purchase later. The wishlist should support adding books, 
removing books, displaying the list of books, and checking if a particular book is already in the wishlist. How would you use Java collections to manage this wishlist functionality efficiently? Consider the various collection types 
available in Java and which one(s) would be most suitable for storing a list of books in this scenario. Additionally, how would you handle scenarios where users might try to add duplicate books to their wishlist? */

import java.util.*;

class Book { // user defined array list
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Book otherBook = (Book) obj;
        return title.equals(otherBook.title) && author.equals(otherBook.author);
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class q5 {
    ArrayList<Book> wishlist = new ArrayList<>();

    public void addBook(Book book) {
        if (!wishlist.contains(book)) {
            wishlist.add(book);
            System.out.println("Book added to wishlist: " + book);
        } else {
            System.out.println("Book is already in the wishlist.");
        }
    }

    public void removeBook(Book book) {
        if (wishlist.remove(book)) {
            System.out.println("Book removed from wishlist: " + book);
        } else {
            System.out.println("Book not found in the wishlist.");
        }
    }

    public void displayWishlist() {
        if (wishlist.isEmpty()) {
            System.out.println("Wishlist is empty.");
        } else {
            System.out.println("Books in the wishlist:");
            for (Book book : wishlist) {
                System.out.println(book);
            }
        }
    }

    public boolean containsBook(Book book) {
        return wishlist.contains(book);
    }

    public static void main(String[] args) {
        q5 obj = new q5();

        Book book1 = new Book("The Merchant of Venice", "Shakespeare");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("11 ways to love", "Foreword by Gulzaar");

        obj.addBook(book1);
        obj.addBook(book2);
        obj.addBook(book3);

        obj.displayWishlist();

        obj.removeBook(book2);

        obj.displayWishlist();

        System.out.println("Contains 'The Merchant of Venice': " + obj.containsBook(book1));
        System.out.println("Contains 'Harry Potter': " + obj.containsBook(new Book("Harry Potter", "J.K. Rowling")));
    }
}
