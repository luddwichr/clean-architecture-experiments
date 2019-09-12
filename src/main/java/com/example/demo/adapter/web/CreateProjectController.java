package com.example.demo.adapter.web;

import com.example.demo.application.port.in.CreateProjectCommand;
import com.example.demo.application.port.in.CreateProjectUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class CreateProjectController {

	private final CreateProjectUseCase createProjectUseCase;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	long createProject(@RequestBody CreateProjectCommand createProjectCommand ) {
		return createProjectUseCase.createProject(createProjectCommand);
	}
}
