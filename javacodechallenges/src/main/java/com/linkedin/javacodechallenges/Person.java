package com.linkedin.javacodechallenges;

public class Person {

  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age < this.age) {
      System.out.printf("You can't make a person younger! New age \"%d\" not set", age);
    } else {
      this.age = age;
    }
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String newName) {
    this.firstName = newName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String newName) {
    this.lastName = newName;
  }

  public void introduction() {
    System.out.printf("Hello my name is %s %s! I am %d years old.\n", this.firstName, this.lastName, this.age);
  }
}