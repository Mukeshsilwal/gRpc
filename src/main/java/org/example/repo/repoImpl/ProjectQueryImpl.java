package org.example.repo.repoImpl;

import org.example.entity.Project;
import org.example.repo.ProjectQuery;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class ProjectQueryImpl implements ProjectQuery {
    private final DataSource dataSource;

    public ProjectQueryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void saveData(Project project) {
        try(Connection connection= dataSource.getConnection()) {
            String query="INSERT INTO project1(id,name) VALUES (?,?)";
            try(PreparedStatement statement=connection.prepareStatement(query)){
                statement.setInt(1,project.getId());
                statement.setString(2, project.getName());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Project updateData(Project project) {
        return null;
    }

    @Override
    public Project getData(int id) {
        return null;
    }

    @Override
    public void deleteData(int id) {

    }
}
