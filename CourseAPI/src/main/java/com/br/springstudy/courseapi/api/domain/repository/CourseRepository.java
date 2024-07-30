package com.br.springstudy.courseapi.api.domain.repository;

import com.br.springstudy.courseapi.api.domain.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

}
