package com.example.demo.adapter.peristence;

import com.example.demo.domain.Project;
import org.springframework.data.repository.CrudRepository;

interface ProjectRepository extends CrudRepository<Project, Long> {
}
