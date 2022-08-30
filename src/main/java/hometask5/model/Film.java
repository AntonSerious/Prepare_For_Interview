package hometask5.model;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Film_Name")
    private String filmName;

    @Column(name = "Duration")
    private int duration;

    public Film() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Film( String filmName, int duration) {
        this.filmName = filmName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.id + " " + this.filmName + " " + this.duration;
    }
}
