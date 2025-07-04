package LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
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

