package com.codeclan.trackingapp.trackingapp.repositories;

import com.codeclan.trackingapp.trackingapp.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
