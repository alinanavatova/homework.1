package com.company;

public class Grandfather {
    private String name;
    private int age;
    private Job job;
    private PlaceOfWork placeOfWork;

    public Grandfather(String name, int age, Job job, PlaceOfWork placeOfWork) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.placeOfWork = placeOfWork;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public PlaceOfWork getPlaceOfWork() {
        return placeOfWork;
    }
}
