package com.example.workload.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Schedule {
    @Id
    private String id;
    private Teacher teacher;
    private List<Subject> subjects;
    private Load load;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Schedule(Teacher teacher, List<Subject> subjects, Load load) {
        this.teacher = teacher;
        this.subjects = subjects;
        this.load = load;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(id, schedule.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
