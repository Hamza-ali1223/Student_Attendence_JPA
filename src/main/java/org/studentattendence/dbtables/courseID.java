package org.studentattendence.dbtables;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class courseID implements Serializable
{
    private LocalDate date;
    private String CourseName;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        courseID courseID = (courseID) o;
        return Objects.equals(date, courseID.date) && Objects.equals(CourseName, courseID.CourseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, CourseName);
    }
}
