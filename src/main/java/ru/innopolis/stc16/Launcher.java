package ru.innopolis.stc16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.innopolis.stc16.entity.Person;

public class Launcher {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Person person = context.getBean(Person.class);
    System.out.println(String.valueOf(person));
  }
}
