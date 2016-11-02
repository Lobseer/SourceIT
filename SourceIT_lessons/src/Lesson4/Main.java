package Lesson4;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Developer vasya = new Developer();
        vasya.setName("Vasya");
        vasya.setSalary(400d);

        Developer petya = new Treinee();
        petya.setName("Petya");
        petya.setSalary(300d);

        Developer igor= new Middle();
        igor.setName("Petya");
        igor.setSalary(200d);

        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(igor);



        if(vasya instanceof Treinee) { // instansof - проверяеть принадлежит ли объект к классу
            Treinee n = (Treinee) vasya;
        }


    }

}
