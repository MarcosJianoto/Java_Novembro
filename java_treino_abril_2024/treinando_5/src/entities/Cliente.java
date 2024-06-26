package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

  private DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  private String name;
  private String email;
  private LocalDate birthDate;

  public Cliente() {}

  public Cliente(String name, String email, LocalDate birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return name + " (" + birthDate.format(sdf) + " ) - " + email;
  }
}
