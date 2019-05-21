package com.codeclan.trackingapp.trackingapp.repositories;

import com.codeclan.trackingapp.trackingapp.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
