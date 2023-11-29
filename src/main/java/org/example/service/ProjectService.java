package org.example.service;

import org.example.entity.Project;

public interface ProjectService {
    void saveProject(Project project);
    Project updateProject(Project project);
    Project getProject(int id);
    void deleteProject(int id);
}
