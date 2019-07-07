package ru.innopolis.stc16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.innopolis.stc16.entity.Person;

public class Launcher {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Person person1 = context.getBean(Person.class);
    Person person2 = context.getBean(Person.class);
    System.out.println(String.valueOf(person1));
    System.out.println(String.valueOf(person2));
    System.out.println(person1 == person2);
  }
}
