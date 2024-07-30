package com.br.springstudy.courseapi.api.domain.rest.controller;

import com.br.springstudy.courseapi.api.domain.entity.CourseEntity;
import com.br.springstudy.courseapi.api.domain.rest.forms.CreateCourseForm;
import com.br.springstudy.courseapi.api.domain.service.CreateCourseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseController {

    private final CreateCourseService createCourseService;

    @PostMapping("/create")
    public CourseEntity create(@RequestBody @Valid CreateCourseForm form) {
        return this.createCourseService.execute(form.getTeacherId(), form.getName(), form.getStartAt(), form.getEndAt());
    }
}
