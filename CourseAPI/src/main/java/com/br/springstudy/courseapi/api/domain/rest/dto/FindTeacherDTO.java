package com.br.springstudy.courseapi.api.domain.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindTeacherDTO {

    private Long id;
    private String name;
    private List<CourseDTO> courses;

    public FindTeacherDTO(String cagei) {
        this.courses = getCourses();
    }
}
