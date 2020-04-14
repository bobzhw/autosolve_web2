package edu.uestc.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shs_question")
public class Question {

    @Id
    @Column(name="questionid")
    private String id;
    private String area;
    @Column(name="questionType")
    private String questionType;
    private String stem;
    @Column(name="subStem")
    private String subStem;
    private String type;
    private String year;
    private String stem2;
    @Column(name="subStem2")
    private String subStem2;
    private String options;
    private String config;
    private int category;
    @Column(name="table_info")
    private String table_info;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getTable_info() {
        return table_info;
    }

    public void setTable_info(String table_info) {
        this.table_info = table_info;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getStem2() {
        return stem2;
    }

    public void setStem2(String stem2) {
        this.stem2 = stem2;
    }

    public String getSubStem2() {
        return subStem2;
    }

    public void setSubStem2(String subStem2) {
        this.subStem2 = subStem2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }





    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getSubStem() {
        return subStem;
    }

    public void setSubStem(String subStem) {
        this.subStem = subStem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", questionType=" + questionType +
                ", stem='" + stem + '\'' +
                ", subStem='" + subStem + '\'' +
                ", type='" + type + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public Question() {
    }


}
