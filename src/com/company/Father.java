package com.company;

public class Father extends Grandfather {

    public Father(String name, int age, Job job, PlaceOfWork placeOfWork) {
        super(name, age, job, placeOfWork);
    }

    public String getInfo(){
        return "Имя: " +  getName() +
                "\nВозраст: " + getAge() +
                "\nПрофессия: " + getJob() +
                "\nМесто работы: " + getPlaceOfWork().getWorkPlace() +
                "\nАдрес места работы: " + getPlaceOfWork().getAddress();
    }

    public final void howManySons(int number){
        System.out.println("Сыновей: " + number);
    }
}
