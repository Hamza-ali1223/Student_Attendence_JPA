package org.studentattendence.dbtables;

import javax.persistence.*;

@Entity
public class Batch_24Students
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String student_id;

    @ManyToOne
    private Batch_24Courses course24;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Batch_24Courses getCourse24() {
        return course24;
    }

    public void setCourse24(Batch_24Courses course24) {
        this.course24 = course24;
    }
}
