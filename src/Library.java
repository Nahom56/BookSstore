import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Map<Member, Set<Book>>  tracker;

    public Library() {
        tracker = new HashMap<>();
    }
    public void borrowBook(Member member, Book book) {
        // 1st check if the key is already in the map
        // 2nd if 1 is true we just put the member as a key and intialize an empty set

        if (!tracker.containsKey(member)){
            tracker.put(member, new HashSet<>());
        }

        //3rd if 1 is false we put the member and add the book to the set of books borrowed

        tracker.get(member).add(book);
    }

    public void returnBook(Member member, Book book) {
//        Set<Book> bookBorrowed = tracker.get(member);
//        bookBorrowed.remove(book);
        tracker.get(member).remove(book);
    }
    public void listBooksBorrowed(Member member) {
        Set<Book> bookBorrowed = tracker.get(member);
        System.out.println("Current List Borrowed: ");
        for (Book book : bookBorrowed){
            System.out.println(book);
        }

    }
}
