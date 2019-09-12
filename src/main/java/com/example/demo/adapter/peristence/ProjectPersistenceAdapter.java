package com.example.demo.adapter.peristence;

import com.example.demo.application.port.out.SaveProjectPort;
import com.example.demo.common.PersistenceAdapter;
import com.example.demo.domain.Project;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
class ProjectPersistenceAdapter implements SaveProjectPort {

	private final ProjectRepository projectRepository;

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

}
