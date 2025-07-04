package LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

