class LibraryItem {
    void borrow() {
        System.out.println("Borrowing a library item...");
    }
}
class Book extends LibraryItem {
    @Override
    void borrow() {
        System.out.println("Borrowing a Book for 14 days.");
    }
}
class DVD extends LibraryItem {
    @Override
    void borrow() {
        System.out.println("Borrowing a DVD for 7 days.");
    }
}
class Magazine extends LibraryItem {
    @Override
    void borrow() {
        System.out.println("Borrowing a Magazine for 3 days.");
    }
}
public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(),
            new DVD(),
            new Magazine()
        };

        for (LibraryItem item : items) {
            item.borrow();
        }
    }
}
