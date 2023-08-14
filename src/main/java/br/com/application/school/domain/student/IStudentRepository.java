package br.com.application.school.domain.student;

import java.util.List;

public interface IStudentRepository {

  void register(Student student);

  Student getByCpf(CPF cpf);

  List<Student> listAll();
}
