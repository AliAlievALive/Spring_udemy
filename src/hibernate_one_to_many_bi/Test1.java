package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
//            Department dep = new Department("Sales", 800, 1_500);
//            Employee emp1 = new Employee("Ali", "Aliev", 800);
//            Employee emp2 = new Employee("Zaur", "Tregulov", 1_000);
//            Employee emp3 = new Employee("Elena", "Smirnova", 1_200);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("done");
//********************************************************

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees of department");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("done");
//**********************************************************

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("done");
        }
    }
}
