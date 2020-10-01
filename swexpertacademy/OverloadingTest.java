package swexpertacademy;

import swexpertacademy.Book;
import swexpertacademy.BookManager;

public class OverloadingTest {
    public static void main(String[] args) {
        Book[] bookList = { new Book("Java Programming", 2500, "컴퓨터"),
                new Book("C Programming", 2000, "컴퓨터"),
                new Book("둘리", 1000, "만화")
        };
        BookManager manager = new BookManager();
        System.out.println("전체 평균: " + manager.getAvg(bookList));
        System.out.println("컴퓨터의 평군: " + manager.getAvg(bookList, "컴퓨터"));
    }
}
