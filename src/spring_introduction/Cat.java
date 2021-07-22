package spring_introduction;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean created");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
