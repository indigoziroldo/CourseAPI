package com.br.springstudy.courseapi.api.domain.service;

import com.br.springstudy.courseapi.api.domain.entity.CourseEntity;
import com.br.springstudy.courseapi.api.domain.entity.TeacherEntity;
import com.br.springstudy.courseapi.api.domain.repository.CourseRepository;
import com.br.springstudy.courseapi.api.domain.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class CreateCourseService {

    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    public CourseEntity execute(Long teachterId, String courseName, LocalDate startAt, LocalDate endAt) {
        TeacherEntity teacher = this.teacherRepository.findById(teachterId)
                .orElseThrow(() -> new RuntimeException("Teacher Not found"));

        CourseEntity course = new CourseEntity();
        course.setName(courseName);
        course.setStartAt(startAt);
        course.setEndAt(endAt);
        course.setTeacher(teacher);
        course.setTeacherId(teacher.getId());

        course = this.courseRepository.save(course);

        return course;
    }
}
