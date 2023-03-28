public class Libary {
    int pointer = -1;
    int size = 0;
    Book[] books = new Book[1000];

    void updatePointer(int num)
    {
        if (num < 0 || num >= (size - 1)) {
            System.out.println("Invalid pointer value");
        } else {
            pointer = num;
        }
    }

    void addBook(Book book)
    {
        pointer++;
        books[pointer] = book;
        System.out.println("Book has been added");
    }

    void removeBook()
    {
        books[pointer] = null;
        pointer--;
    }

    void outputLibary()
    {
        for (int x = 0; x < pointer + 1; x++) {
            int a = books[x].getBookNumber();
            int b = books[x].getNumberOfPages();
            String c = books[x].getTitle();
            System.out.print(a + ", " + b + ", " + c);
            System.out.println("");
        }
    }
}