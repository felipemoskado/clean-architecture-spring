package br.com.application.school.domain.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CPFTest {

  @Test
  void throwExceptionWhenCPFInvalid() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF("1234"));
  }

  @Test
  void createCPF() {
    Assertions.assertEquals(new CPF("012.345.678-90").getNumber(), "012.345.678-90");
  }
}
