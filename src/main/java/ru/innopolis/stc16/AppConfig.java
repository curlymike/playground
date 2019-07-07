package ru.innopolis.stc16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import ru.innopolis.stc16.entity.Contact;
import ru.innopolis.stc16.entity.Country;
import ru.innopolis.stc16.entity.Person;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ImportResource("classpath:/application-context.xml")
public class AppConfig {
  @Autowired
  private Country country;

  @Bean(name = "pesron")
  @Scope("prototype")
  public Person getPersonBean() {
    List<Contact> contacts = new ArrayList<>();
    contacts.add(new Contact("ivanov@mail.ru"));
    contacts.add(new Contact("+78120000000"));

    Person person = new Person();
    person.setName("Ivanov Ivan");
    person.setCountry(country);
    person.setContacts(contacts);

    return person;
  }

}
