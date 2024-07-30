package com.br.springstudy.courseapi.api.domain.service;

import com.br.springstudy.courseapi.api.domain.entity.TeacherEntity;
import com.br.springstudy.courseapi.api.domain.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateTeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherEntity execute(String name) {
        TeacherEntity teacherEntity = new TeacherEntity(name);

        teacherEntity = this.teacherRepository.save(teacherEntity);

        return teacherEntity;
    }

}
