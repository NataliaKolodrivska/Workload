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
public class Load {
    @Id
    private String id;
    private Teacher teacher;
    private Subject subject;
    private String numberOfGroup;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Load(Teacher teacher, Subject subject, String numberOfGroup) {
        this.teacher = teacher;
        this.subject = subject;
        this.numberOfGroup = numberOfGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Load load = (Load) o;
        return Objects.equals(id, load.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
