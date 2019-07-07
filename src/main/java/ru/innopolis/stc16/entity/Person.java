package ru.innopolis.stc16.entity;

import java.util.List;

public class Person {
  private int id;
  private String name;
  private Country country;
  private List<Contact> contacts;

  public Person() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer();
    sb.append("id = ").append(id).append("\n");
    sb.append("name = '").append(name).append('\'').append("\n");
    sb.append("country = {").append(country).append("}\n");
    sb.append("contacts = ");
    if (contacts != null) {
      sb.append(contacts);
    } else {
      sb.append("NULL");
    }
    sb.append("\n");
    return sb.toString();
  }
}
