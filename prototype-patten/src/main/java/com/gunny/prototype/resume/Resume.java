package com.gunny.prototype.resume;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String compony;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonInfo(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String timeArea, String compony) {
        this.timeArea = timeArea;
        this.compony = compony;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", compony='" + compony + '\'' +
                '}';
    }
}
