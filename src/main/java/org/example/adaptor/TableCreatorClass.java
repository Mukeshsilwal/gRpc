package org.example.adaptor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class TableCreatorClass {
    private final DataSource dataSource;

    public TableCreatorClass(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void tableCreator(){
        try(Connection connection=dataSource.getConnection()) {
            String query="CREATE TABLE IF NOT EXISTS employee1("
                    + "id INT PRIMARY KEY,"
                    + "name VARCHAR(255),"
                    + "email VARCHAR(255)"
                    + ")";
            String query1="CREATE TABLE IF NOT EXISTS department1("
                    + "id INT PRIMARY KEY,"
                    + "name VARCHAR(255),"
                    +"employee_id int,"
                    +"FOREIGN KEY(employee_id) REFERENCES employee1(id)"
                    + ")";
            String query2="CREATE TABLE IF NOT EXISTS project("
                    +"id INT primary key,"
                    + "name varchar(244) ,"
                    +"employee_id int,"
                    +"FOREIGN KEY(employee_id) REFERENCES employee1(id)"
                    + ")";
            try(PreparedStatement statement= connection.prepareStatement(query)){
                statement.executeUpdate();
            }
            try(PreparedStatement statement= connection.prepareStatement(query1)){
                statement.executeUpdate();
            }
            try(PreparedStatement  statement= connection.prepareStatement(query2)){
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
