package org.example.repo.repoImpl;

import org.example.entity.Employee;
import org.example.repo.EmployeeQuery;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class EmployeeQueryImpl implements EmployeeQuery {
    private final DataSource dataSource;

    public EmployeeQueryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void saveData(Employee employee) {
        try(Connection connection= dataSource.getConnection()) {
            String query="INSERT INTO employee12(id,name,email) VALUES (?,?,?)";
            try(PreparedStatement statement=connection.prepareStatement(query)){
                statement.setInt(1,employee.getId());
                statement.setString(2, employee.getName());
                statement.setString(3,employee.getEmail());
                 statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteData(int id) {
        try(Connection connection= dataSource.getConnection()) {
            String query="DELETE FROM employee1 WHERE id=?";
            try(PreparedStatement statement= connection.prepareStatement(query)){
                statement.setInt(1,id);
               int rowAffected= statement.executeUpdate();
               System.out.println("Row affected :"+rowAffected);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Employee updateData(Employee employee) {
        try(Connection connection= dataSource.getConnection()) {
            String query="UPDATE employee1 SET id=?,name=?,email=? WHERE id=?";
            try(PreparedStatement statement= connection.prepareStatement(query)){
                statement.setInt(1,employee.getId());
                statement.setString(2, employee.getName());
                statement.setString(3, employee.getEmail());
                statement.setInt(4,employee.getId());
               statement.executeUpdate();


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return employee;
    }

    @Override
    public Employee getEmployee(int id) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM employee1 WHERE id=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return mapToEmployee(resultSet);
                    } else {
                        return null;
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Employee mapToEmployee(ResultSet resultSet) throws SQLException {
        int id1=resultSet.getInt("id");
        String name=resultSet.getString("name");
        String email= resultSet.getString("email");
        return new Employee(id1,"name","email");
    }
    }
