package com.br.springstudy.courseapi.api.domain.rest.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCourseForm {

    private Long teacherId;
    private String name;
    private LocalDate startAt;
    private LocalDate endAt;

}
