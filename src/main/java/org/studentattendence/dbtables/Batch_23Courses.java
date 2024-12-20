package org.studentattendence.dbtables;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Batch_23Courses
{
    @EmbeddedId
    private courseID course;
    @OneToMany(mappedBy = "course23")
    private List<Batch_23Students> sd= new ArrayList<>();

    public courseID getCourse() {
        return course;
    }

    public void setCourse(courseID course) {
        this.course = course;
    }

    public List<Batch_23Students> getSd() {
        return sd;
    }

    public void setSd(List<Batch_23Students> sd) {
        this.sd = sd;
    }
}
