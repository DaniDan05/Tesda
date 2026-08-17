class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;


    Book (String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return 
            "Title: " + this.title +  
            "\nAuthor: " + this.author + 
            "\nYear Published: " + this.yearPublished + 
            "\nPrice: $" + this.price;
    }
}