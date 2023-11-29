package org.example.repo;

import org.example.entity.Project;

public interface ProjectQuery {
    void saveData(Project project);
    Project updateData(Project project);
    Project getData(int id);
    void deleteData(int id);
}
