package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("Book is getted from uniLibrary " + book.getName());
    }

//    public void returnBook() {
//        System.out.println("They return book to uniLibrary");
//    }

    public void getMagazine() {
        System.out.println("Magazine is getted from uniLibrary");
    }
}
