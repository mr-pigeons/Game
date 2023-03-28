public class Book {
    public int bookNumber;
    public int numberOfPages;
    public String title;

    public Book(int bookNumber, int numberOfPages, String title)
    {
        this.bookNumber = bookNumber;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public int getBookNumber()
    {
        return bookNumber;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public String getTitle()
    {
        return title;
    }

}
