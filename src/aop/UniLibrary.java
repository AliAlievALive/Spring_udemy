package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Book is getted from uniLibrary");
        System.out.println("------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("They return book to uniLibrary");
        return "War and peace";
    }

    public void getMagazine() {
        System.out.println("Magazine is getted from uniLibrary");
        System.out.println("------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Magazine is returned from uniLibrary");
        System.out.println("------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Book is added to uniLibrary");
        System.out.println("------------------------------");
    }

    public void addMagazine() {
        System.out.println("Magazine is added to uniLibrary");
        System.out.println("------------------------------");
    }
}
