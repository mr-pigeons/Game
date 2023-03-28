import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Libary libary = new Libary();
        Scanner myScanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            output();
            int option = myScanner.nextInt();
            if (option == 1) {
                System.out.println("Option 1 selected");
                int bookNumber = myScanner.nextInt();
                myScanner.nextLine();
                int numberOfPages = myScanner.nextInt();
                myScanner.nextLine();
                String bookTitle = myScanner.nextLine();
                libary.addBook(new Book(bookNumber, numberOfPages, bookTitle));
            } else if (option == 2) {
                System.out.println("Option 2 selected");
                libary.outputLibary();
            } else if (option == 3) {
                System.out.println("Option 3 selected");
                run = false;
            } else {
                System.out.println("Please pick a valid number.");
            }
        }
    }

    static void output()
    {
        System.out.println("What would you like to do?");
        System.out.println("1.Add Book");
        System.out.println("2.Output Library");
        System.out.println("3. Exit");
    }
}