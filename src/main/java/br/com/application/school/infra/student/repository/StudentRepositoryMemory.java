package br.com.application.school.infra.student.repository;

import br.com.application.school.domain.student.CPF;
import br.com.application.school.domain.student.IStudentRepository;
import br.com.application.school.domain.student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryMemory implements IStudentRepository {

  private List<Student> students = new ArrayList<>();

  @Override
  public void register(Student student) {
    this.students.add(student);
  }

  @Override
  public Student getByCpf(CPF cpf) {
    return this.students.stream()
      .filter(student -> student.getCpf().equals(cpf.getNumber()))
      .findFirst()
      .orElseThrow(() -> new RuntimeException("Student not found"));
  }

  @Override
  public List<Student> listAll() {
    return this.students;
  }
}
