package br.com.application.school.domain;

import br.com.application.school.domain.student.Student;

public interface ISendEmail {

  void sendTo(Student student);
}
