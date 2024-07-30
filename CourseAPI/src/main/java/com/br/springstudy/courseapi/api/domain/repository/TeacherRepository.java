package com.br.springstudy.courseapi.api.domain.repository;

import com.br.springstudy.courseapi.api.domain.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
}
