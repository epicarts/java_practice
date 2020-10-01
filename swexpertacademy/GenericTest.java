package swexpertacademy;

import swexpertacademy.Book;

import java.util.Vector;

public class GenericTest {
    private static int avgPrice(Vector<Book> bookList) {
        int sumPrice = 0;
        for (Book book : bookList) {
            sumPrice = sumPrice + book.price;
        }
        int avgPrice = sumPrice / bookList.size();

        return avgPrice;
    }

    private static Book getMaxPriceBook(Vector<Book> bookList){
        int maxPrice = 0;
        Book selectedBook = null;
        for (Book book: bookList) {
            if(book.price > maxPrice) {
                maxPrice = book.price;
                selectedBook = book;
            }
        }
        return selectedBook;
    }

    public static void main(String[] args) {
        Vector<Book> bookList = new Vector<Book>();
        bookList.add(new Book("Java Programming ", 28000, "전공"));
        bookList.add(new Book("c Programming ", 2300, "전공"));
        bookList.add(new Book("c Programming ", 24000, "전공"));

        System.out.println("Book의 평균 가격" + avgPrice(bookList));
        Book maxPriceBook = getMaxPriceBook(bookList);
        System.out.println("최고가 책" + maxPriceBook.toString());
    }
}
