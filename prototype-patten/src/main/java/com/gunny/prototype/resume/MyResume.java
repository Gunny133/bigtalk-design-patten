package com.gunny.prototype.resume;

public class MyResume {
    public static void main(String[] args) {
        Resume resume = new Resume("zhangsan");
        resume.setPersonInfo("28", "male");
        resume.setWorkExperience("2010-2015", "xx company");
        Resume copyResume = null;
        try {
            long startTime = System.currentTimeMillis();
            copyResume = (Resume) resume.clone();
            copyResume.setPersonInfo("27", "female");
            System.out.printf("clone costs %d ms", (System.currentTimeMillis() - startTime));
            System.out.println();
            long startTime2  = System.currentTimeMillis();
            Resume copyResume2 = new Resume("wangmazi");
            copyResume.setPersonInfo("27", "female");
            System.out.printf("new costs %d ms", (System.currentTimeMillis() - startTime));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        System.out.println(resume);
//        System.out.println(copyResume);

    }
}

