package br.com.application.school.domain.student;

public class StudentBuilder {

  private Student student;

  public StudentBuilder() {
    student = new Student();
  }

  public static StudentBuilder builder() {
    return new StudentBuilder();
  }

  public Student build() {
    return this.student;
  }

  public StudentBuilder withName(String name) {
    this.student.setFullname(name);
    return this;
  }

  public StudentBuilder withCpf(String cpf) {
    this.student.setCpf(new CPF(cpf));
    return this;
  }

  public StudentBuilder withEmail(String email) {
    this.student.setEmail(new Email(email));
    return this;
  }

  public StudentBuilder withTelephone(String ddd, String number) {
    this.student.addTelephone(new Telephone(ddd, number));
    return this;
  }
}
