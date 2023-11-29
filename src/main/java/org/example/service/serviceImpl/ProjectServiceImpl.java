package org.example.service.serviceImpl;

import org.example.entity.Project;
import org.example.repo.ProjectQuery;
import org.example.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectQuery query;

    public ProjectServiceImpl(ProjectQuery query) {
        this.query = query;
    }

    @Override
    public void saveProject(Project project) {
        query.saveData(project);

    }

    @Override
    public Project updateProject(Project project) {
        return null;
    }

    @Override
    public Project getProject(int id) {
        return null;
    }

    @Override
    public void deleteProject(int id) {

    }
}
