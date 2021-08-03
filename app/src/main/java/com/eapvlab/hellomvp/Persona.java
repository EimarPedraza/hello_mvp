package com.eapvlab.hellomvp;

/**
 * Represents the Model in MVP architecture.
 *
 * @author Eimar Pedraza.
 */

public class Persona {
  private String firstName;
  private String lastName;

  public Persona() { }

  public Persona(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }
}
