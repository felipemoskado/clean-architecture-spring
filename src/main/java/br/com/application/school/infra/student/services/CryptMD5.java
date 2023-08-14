package br.com.application.school.infra.student.services;

import br.com.application.school.domain.IHashPassword;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptMD5 implements IHashPassword {


  @Override
  public String crypt(String password) {
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(password.getBytes());
      byte[] bytes = md.digest();
      StringBuilder sb = new StringBuilder();

      for (byte aByte : bytes) {
        sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
      }

      return sb.toString();
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("erro ao gerar hash da senha");
    }
  }

  @Override
  public boolean validPassword(String passwordCrypted, String password) {
    return passwordCrypted.equals(crypt(password));
  }
}
