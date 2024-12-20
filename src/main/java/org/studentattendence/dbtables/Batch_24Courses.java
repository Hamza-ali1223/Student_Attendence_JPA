package org.studentattendence.dbtables;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Batch_24Courses
{

    @EmbeddedId
    private courseID course;
    @OneToMany(mappedBy = "course24")
    private List<Batch_24Students> sd= new ArrayList<>();

    public courseID getCourse() {
        return course;
    }

    public void setCourse(courseID course) {
        this.course = course;
    }

    public List<Batch_24Students> getSd() {
        return sd;
    }

    public void setSd(List<Batch_24Students> sd) {
        this.sd = sd;
    }
}
