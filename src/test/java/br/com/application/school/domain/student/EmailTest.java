package br.com.application.school.domain.student;

import br.com.application.school.domain.student.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

  @Test
  void throwExceptionWhenInvalidEmail() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("xpto"));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("xpto@xpto"));
  }

  @Test
  void createEmail() {
    var email = new Email("xpto@xpto.com");
    Assertions.assertEquals("xpto@xpto.com", email.getAddress());
  }
}
