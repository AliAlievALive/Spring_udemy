package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private int age;
    private String name;
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hi, my lovely Pet!");
        pet.say();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
