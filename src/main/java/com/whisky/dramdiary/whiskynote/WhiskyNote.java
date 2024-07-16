package com.whisky.dramdiary.whiskynote;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity(name = "whiskyNote")
public class WhiskyNote {

    protected WhiskyNote() {}

    @Id
    @GeneratedValue
    private Integer id;

    private String whiskyName;
    private LocalDate openDate;
    private LocalDate drinkDate;
    private String nose;
    private String palate;
    private String finish;

    public WhiskyNote(Integer id, String whiskyName, LocalDate openDate, LocalDate drinkDate, String nose, String palate, String finish) {
        super();
        this.id = id;
        this.whiskyName = whiskyName;
        this.openDate = openDate;
        this.drinkDate = drinkDate;
        this.nose = nose;
        this.palate = palate;
        this.finish = finish;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWhiskyName() {
        return whiskyName;
    }

    public void setWhiskyName(String whiskyName) {
        this.whiskyName = whiskyName;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public LocalDate getDrinkDate() {
        return drinkDate;
    }

    public void setDrinkDate(LocalDate drinkDate) {
        this.drinkDate = drinkDate;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getPalate() {
        return palate;
    }

    public void setPalate(String palate) {
        this.palate = palate;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "WhiskyNote{" +
                "id=" + id +
                ", whiskyName='" + whiskyName + '\'' +
                ", openDate=" + openDate +
                ", drinkDate=" + drinkDate +
                ", nose='" + nose + '\'' +
                ", palate='" + palate + '\'' +
                ", finish='" + finish + '\'' +
                '}';
    }
}
