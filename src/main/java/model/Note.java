package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "note")
public class Note {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "message")
    private String message;
    @Column(name = "date")
    private Date date;
    @Column(name = "done")
    private Boolean done;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessege() {
        return message;
    }

    public void setMessege(String messege) {
        this.message = messege;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", messege='" + message + '\'' +
                ", date=" + date +
                ", done=" + done +
                '}';
    }
}
