package com.example.demo.application.service;

import com.example.demo.application.port.in.CreateProjectCommand;
import com.example.demo.application.port.in.CreateProjectUseCase;
import com.example.demo.application.port.out.LoadAccountPort;
import com.example.demo.application.port.out.SaveProjectPort;
import com.example.demo.common.UseCase;
import com.example.demo.domain.Account;
import com.example.demo.domain.Project;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidatorFactory;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@UseCase
@RequiredArgsConstructor
class CreateProjectService implements CreateProjectUseCase {

	private final SaveProjectPort saveProjectPort;
	private final LoadAccountPort loadAccountPort;
	private final ValidatorFactory validatorFactory;

	@Override
	public long createProject(CreateProjectCommand createProjectCommand) {
		Set<ConstraintViolation<CreateProjectCommand>> violations = validatorFactory.getValidator().validate(createProjectCommand);
		if (!violations.isEmpty()) {
			throw new ConstraintViolationException(violations);
		}
		Account account = loadAccountPort.findById(createProjectCommand.getAccountId())
				.orElseThrow(() -> new AccountNotFoundException(createProjectCommand.getAccountId()));
		Project project = new Project(account, createProjectCommand.getName(), createProjectCommand.getDescription());
		return saveProjectPort.save(project).getId();
	}

}
