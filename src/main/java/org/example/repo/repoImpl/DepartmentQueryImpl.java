package org.example.repo.repoImpl;

import org.example.entity.Department;
import org.example.repo.DepartmentQuery;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class DepartmentQueryImpl implements DepartmentQuery {
    private final DataSource dataSource;

    public DepartmentQueryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void saveData(Department department) {
        try(Connection connection= dataSource.getConnection()) {
            String query="INSERT INTO depart(id,name) VALUES (?,?)";
            try(PreparedStatement statement=connection.prepareStatement(query)){
                statement.setInt(1,department.getId());
                statement.setString(2, department.getName());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Department updateData(Department department) {
        return null;
    }

    @Override
    public Department getDepartment(int id) {
        return null;
    }

    @Override
    public void deleteData(int id) {

    }
}
