//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Book I", 1);
        Book bookTwo = new Book("Book II", 2);
        Book bookThree = new Book("Book III", 3);
        Book bookFour = new Book("Book IV", 4);
        Book bookFive = new Book("Book V", 5);
        Book bookSix = new Book("Book VI", 6);
        Book bookSeven = new Book("Book VII", 7);
        Book bookEight = new Book("Book VIII", 8);

        Member memberOne = new Member(1, "Hana");
        Member memberTwo = new Member(2, "Nah");
        Member memberThree = new Member(3, "Jack");

        Library library = new Library();

        library.borrowBook(memberOne, bookOne);
        library.borrowBook(memberTwo, bookTwo);

        library.listBooksBorrowed(memberOne);

        library.borrowBook(memberOne, bookFour);
        library.listBooksBorrowed(memberOne);



    }
}