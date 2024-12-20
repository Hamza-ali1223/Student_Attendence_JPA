package org.studentattendence.dbtables;

import javax.persistence.*;

@Entity
public class Batch_23Students
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String student_id;

    @ManyToOne
    private Batch_23Courses course23;

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

    public Batch_23Courses getCourse23() {
        return course23;
    }

    public void setCourse23(Batch_23Courses course23) {
        this.course23 = course23;
    }
}
