package br.com.application.school.domain.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelephoneTest {

  @Test
  void throwExceptionWhenReceiveNullValues() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone(null, null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone(null, "1"));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("1", null));
  }

  @Test
  void throwExceptionWhenDDDInvalid() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("043", "123"));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("0", "123"));
  }

  @Test
  void throwExceptionWhenPhoneNumberInvalid() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Telephone("43", "1234"));
  }

  @Test
  void createTelephone() {
    var telephoneEightNumbers = new Telephone("43", "12345678");
    Assertions.assertEquals(telephoneEightNumbers.getDdd(), "43");
    Assertions.assertEquals(telephoneEightNumbers.getNumber(), "12345678");

    var telephoneNineNumbers = new Telephone("43", "123456789");
    Assertions.assertEquals(telephoneNineNumbers.getDdd(), "43");
    Assertions.assertEquals(telephoneNineNumbers.getNumber(), "123456789");
  }
}
