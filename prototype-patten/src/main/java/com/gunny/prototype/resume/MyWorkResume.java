package com.gunny.prototype.resume;

public class MyWorkResume {
    public static void main(String[] args) {
        WorkResume workResume = new WorkResume("zhangsan");
        workResume.setPersonInfo("28", "male");
        workResume.setWorkExperience("2011-2018", "XX company");

        WorkResume cResume = null;
        try {
            cResume = (WorkResume) workResume.clone();
            cResume.setWorkExperience("2012-2015", "YY company");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(workResume);
        System.out.println(cResume);
    }

}
