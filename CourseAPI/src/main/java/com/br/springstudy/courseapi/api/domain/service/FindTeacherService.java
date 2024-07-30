package com.br.springstudy.courseapi.api.domain.service;

import com.br.springstudy.courseapi.api.domain.entity.TeacherEntity;
import com.br.springstudy.courseapi.api.domain.repository.TeacherRepository;
import com.br.springstudy.courseapi.api.domain.rest.dto.CourseDTO;
import com.br.springstudy.courseapi.api.domain.rest.dto.FindTeacherDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FindTeacherService {
    
    private final TeacherRepository teacherRepository;
    
    public FindTeacherDTO execute(Long id) {
        TeacherEntity teacher = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("Não acho pai :c"));

        FindTeacherDTO dto = new FindTeacherDTO();
        dto.setId(teacher.getId());
        dto.setName(teacher.getName());
        dto.setCourses(teacher.getCourses().stream().map(courseEntity ->
                new CourseDTO(courseEntity.getId(), courseEntity.getName())).toList());

        return dto;
    }
    
}
