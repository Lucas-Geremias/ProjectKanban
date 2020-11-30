package com.av2.kanban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.av2.kanban.domain.Project;
import com.av2.kanban.domain.exceptions.ProjectIdException;
import com.av2.kanban.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		
		}catch (Exception e) {
			throw new ProjectIdException("Project Id"+project.getProjectIdentifier().toUpperCase()+" already exists");
		}
		
	}
}
