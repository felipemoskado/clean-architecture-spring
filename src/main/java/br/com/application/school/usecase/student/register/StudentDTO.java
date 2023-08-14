package br.com.application.school.usecase.student.register;

import br.com.application.school.domain.student.Student;
import br.com.application.school.domain.student.StudentBuilder;

public class StudentDTO {
  private String name;
  private String cpf;
  private String email;

  public StudentDTO(String name, String cpf, String email) {
    this.name = name;
    this.cpf = cpf;
    this.email = email;
  }

  public Student getStudent() {
    return new StudentBuilder().withCpf(cpf).withName(name).withEmail(email).build();
  }

  public String getName() {
    return name;
  }

  public String getCpf() {
    return cpf;
  }

  public String getEmail() {
    return email;
  }
}
