package com.br.springstudy.courseapi.api.domain.rest.controller;

import com.br.springstudy.courseapi.api.domain.entity.TeacherEntity;
import com.br.springstudy.courseapi.api.domain.rest.dto.FindTeacherDTO;
import com.br.springstudy.courseapi.api.domain.service.CreateTeacherService;
import com.br.springstudy.courseapi.api.domain.service.FindTeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@AllArgsConstructor
public class TeacherController {

    private final CreateTeacherService createTeacherService;
    private final FindTeacherService findTeacherService;

    @PostMapping("/create")
    public TeacherEntity create() { // TODO: Criar o form de Teacher
        return this.createTeacherService.execute("Professor"); // TODO: Criar o DTO de Teacher
    }

    @GetMapping("/{id}")
    public FindTeacherDTO find(@PathVariable Long id) {
        return this.findTeacherService.execute(id);
    }
}
