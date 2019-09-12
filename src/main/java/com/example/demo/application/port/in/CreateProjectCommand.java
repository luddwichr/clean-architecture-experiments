package com.example.demo.application.port.in;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
public class CreateProjectCommand {

	@NotNull
	private Long accountId;
	@NotEmpty
	private String name;
	@NotEmpty
	private String description;

}
