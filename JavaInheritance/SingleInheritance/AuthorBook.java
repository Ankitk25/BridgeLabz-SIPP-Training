class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }

    public static void main(String[] args) {
        Author a = new Author("1984", 1949, "George Orwell", "English novelist and essayist");
        a.displayInfo();
    }
}