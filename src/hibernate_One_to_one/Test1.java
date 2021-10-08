package hibernate_One_to_one;

import hibernate_One_to_one.entity.Detail;
import hibernate_One_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Ibanov", "Sale", 700);
//            Detail detail = new Detail("Msc", "321321321", "@ya.ru");
//
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("done");
//////////////////////////////////////////////////////////////////
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("done");
//////////////////////////////////////////////////////////////////
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("done");
        }
    }
}
