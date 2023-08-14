package br.com.application.school.domain;

public interface IHashPassword {

  String crypt(String password);

  boolean validPassword(String passwordCrypted, String password);

}
