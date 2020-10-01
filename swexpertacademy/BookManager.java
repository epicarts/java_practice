package swexpertacademy;

public class BookManager {
    public double getAvg(Book[] bookList) {
        int sum = 0;
        for (int i = 0; i < bookList.length; i++) {
            sum = sum + bookList[i].price;
        }
        return (double)sum/bookList.length;
    }

    public double getAvg(Book[] bookList, String kind) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < bookList.length; i++) {
            if(bookList[i].kind.equals(kind)) {
                sum = sum + bookList[i].price;
                count++;
            }
        }
        return (double)sum/count;
    }
}
