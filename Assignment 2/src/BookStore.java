import java.util.*;
public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bookName;
        double bookPrice;
        int count = 0, x = 2;
        char c;
        Book[] book = new Book[30];
        while (x != 0) {
            System.out.println("Enter input: ");
            c = input.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.println("Book Name:");
                    input.nextLine();
                    bookName = input.nextLine();
                    System.out.println("Book Price:");
                    bookPrice = input.nextDouble();
                    book[count] = new Book(bookName, bookPrice);
                    count++;
                    break;
                case 'p':
                    for (int i = 0; i < count; i++) {
                        book[i].display();
                        System.out.println("*********************");
                    }
                    break;
                case 'q':
                    x = 0;
                    break;
                default:
                    System.out.println("Please choose a valid option.");


            }


        }

    }
}