package com.example.workload.model;

import com.example.workload.model.enums.TypeOfSubject;
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
public class Subject {
    @Id
    private String id;
    private String name;
    private TypeOfSubject typeOfSubject;
    private Integer numberOfHours;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Subject(String name, TypeOfSubject typeOfSubject, Integer numberOfHours) {
        this.name = name;
        this.typeOfSubject = typeOfSubject;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
