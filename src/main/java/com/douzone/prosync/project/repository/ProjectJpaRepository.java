package com.douzone.prosync.project.repository;

import com.douzone.prosync.project.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectJpaRepository extends JpaRepository<Project, Integer> {

    Page<Project> findAllByIsDeletedNull(Pageable pageable);

}
