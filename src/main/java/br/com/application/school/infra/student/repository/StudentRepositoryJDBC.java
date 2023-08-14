package br.com.application.school.infra.student.repository;

import br.com.application.school.domain.student.CPF;
import br.com.application.school.domain.student.IStudentRepository;
import br.com.application.school.domain.student.Student;
import br.com.application.school.domain.student.Telephone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryJDBC implements IStudentRepository {

  public Connection connection;

  public StudentRepositoryJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void register(Student student) {
    try {
      PreparedStatement ps = connection.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
      ps.setString(1, student.getCpf());
      ps.setString(2, student.getFullname());
      ps.setString(3, student.getEmail());
      ps.execute();

      ps = connection.prepareStatement("INSERT INTO TELEPHONE VALUES(?,?)");

      for (Telephone telephone : student.getTelephones()) {
        ps.setString(1, telephone.getDdd());
        ps.setString(2, telephone.getNumber());
        ps.execute();
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Student getByCpf(CPF cpf) {
    // TODO
    return null;
  }

  @Override
  public List<Student> listAll() {
    // TODO
    return null;
  }
}
