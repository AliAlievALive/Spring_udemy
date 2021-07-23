package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Book is getted from uniLibrary");
    }

    public void returnBook() {
        System.out.println("They return book to uniLibrary");
    }

    public void getMagazine() {
        System.out.println("Magazine is getted from uniLibrary");
    }
}
