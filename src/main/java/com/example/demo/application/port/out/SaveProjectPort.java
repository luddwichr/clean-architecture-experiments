package com.example.demo.application.port.out;

import com.example.demo.domain.Project;

public interface SaveProjectPort {
	Project save(Project project);
}
