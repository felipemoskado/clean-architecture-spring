package br.com.application.school.domain.recommendation;

import br.com.application.school.domain.student.Student;

import java.time.LocalDateTime;

public class Recommendation {

  private Student recommended;
  private Student byStudant;
  private LocalDateTime dateAt;

  public Recommendation(Student recommended, Student byStudant) {
    this.recommended = recommended;
    this.byStudant = byStudant;
    this.dateAt = LocalDateTime.now();
  }

  public Student getRecommended() {
    return recommended;
  }

  public void setRecommended(Student recommended) {
    this.recommended = recommended;
  }

  public Student getByStudant() {
    return byStudant;
  }

  public void setByStudant(Student byStudant) {
    this.byStudant = byStudant;
  }

  public LocalDateTime getDateAt() {
    return dateAt;
  }
}
