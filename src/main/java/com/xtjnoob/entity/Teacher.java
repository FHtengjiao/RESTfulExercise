package com.xtjnoob.entity;

public class Teacher {
    private String id;
    private String name;
    private String sex;
    private String course;
    private String collage;

    public Teacher(String id, String name, String sex, String course, String collage) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.course = course;
        this.collage = collage;
    }

    public Teacher() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }
}
