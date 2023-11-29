package org.example.facade.facadeImpl;

import org.example.entity.Project;
import org.example.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import proto.ProjectOuterClass;

@Service
public class ProjectFacade {
    private final ProjectService service;
    private final ModelMapper mapper;

    public ProjectFacade(ProjectService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    public void saveProject(ProjectOuterClass.Project project){
        Project project1=toProject(project);
        service.saveProject(project1);
    }
//    public ProjectOuterClass.Project getProject(ProjectOuterClass.ProjectRequest request){
//
//    }
//    public ProjectOuterClass.Project updateProject(ProjectOuterClass.Project project){
//
//    }
    public void deleteProject(ProjectOuterClass.ProjectRequest request){

    }
    public Project toProject(ProjectOuterClass.Project project){
        return mapper.map(project,Project.class);
    }
    public ProjectOuterClass.Project toOuterClass(Project project){
        return mapper.map(project, ProjectOuterClass.Project.class);
    }
}
