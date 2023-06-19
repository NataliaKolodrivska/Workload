package com.example.workload.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Teacher {
    @Id
    private String id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String degree;
    private String position;
    private Integer experience;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Teacher(String lastName, String firstName, String patronymic, String degree,
                   String position, Integer experience) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.degree = degree;
        this.position = position;
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
