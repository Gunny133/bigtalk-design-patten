package com.gunny.prototype.resume;

public class WorkResume implements Cloneable {
    private String name;
    private String age;
    private String sex;
    private WorkExperience workExperience;

    public WorkResume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public void setPersonInfo(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String timeArea, String company) {
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }

    private void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        WorkResume workResume = (WorkResume) super.clone();
        workResume.setWorkExperience((WorkExperience) workExperience.clone());
        return workResume;
    }

    @Override
    public String toString() {
        return "WorkResume{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
