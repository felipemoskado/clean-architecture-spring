package br.com.application.school.domain.student;

import br.com.application.school.domain.recommendation.Recommendation;

import java.util.ArrayList;
import java.util.List;

public class Student {

  private List<Telephone> telephones = new ArrayList<>();

  private CPF cpf;

  private Recommendation recommendation;
  private Email email;
  private String fullname;


  public Student() {
  }

  public List<Telephone> getTelephones() {
    return telephones;
  }

  public void addTelephone(Telephone telephone) {
    telephones.add(telephone);
  }

  public String getCpf() {
    return cpf.getNumber();
  }

  public void setCpf(CPF cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email.getAddress();
  }

  public void setEmail(Email email) {
    this.email = email;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Recommendation getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(Recommendation recommendation) {
    this.recommendation = recommendation;
  }
}
