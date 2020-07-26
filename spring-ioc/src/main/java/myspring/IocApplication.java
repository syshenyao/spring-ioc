package myspring;

import myspring.core.MyBeanFactoryImpl;
import myspring.domain.Student;
import myspring.domain.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(IocApplication.class, args);
        MyBeanFactoryImpl beanFactory = new MyBeanFactoryImpl();
        User user1 = (User) beanFactory.getBeanByName("myspring.domain.User");
        User user2 = (User) beanFactory.getBeanByName("myspring.domain.User");
        Student student1 = user1.getStudent();
        Student student2 = user2.getStudent();
        Student student3 = (Student) beanFactory.getBeanByName("myspring.domain.Student");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}