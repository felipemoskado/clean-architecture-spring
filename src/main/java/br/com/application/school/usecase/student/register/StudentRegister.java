package br.com.application.school.usecase.student.register;

import br.com.application.school.domain.student.IStudentRepository;

public class StudentRegister {

  private final IStudentRepository repository;

  public StudentRegister(IStudentRepository repository) {
    this.repository = repository;
  }

  public void register(StudentDTO data) {
    repository.register(data.getStudent());
  }
}
