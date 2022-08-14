package com.company;

public class Main {

    public static void main(String[] args) {
        PlaceOfWork placeOfWork = new PlaceOfWork("Школа", "ул.Панфилова,22");
        Father father = new Father("Уильям", 55, Job.TEACHER, placeOfWork);
        System.out.println(father.getInfo());
        father.howManySons(2);

        PlaceOfWork placeOfWork1 = new PlaceOfWork("Больница", "ул.Ленина, 282");
        Son son = new Son("Итан", 25, Job.DOCTOR, placeOfWork1);
        System.out.println(son.getInfo());

        PlaceOfWork placeOfWork2 = new PlaceOfWork("Ресторан", "Третья авеню,797");
        Son son1 = new Son("Майк", 22, Job.COOK, placeOfWork2);
        System.out.println(son1.getInfo());
    }
}
