package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Bear("Vasya",true,13,65,233,13,41,"Brown"),
                new Elephant("Igor",true,53,40,1222,57,70),
                new Zebra("Diana",false,15,60,160,123),
                new Zebra("Marty",true,15,60,160,123),
                new Zebra("Bob",true,15,60,160,123),
                new Lion("Leo",true,28,43,153,7,34,true),
                new Lion("Leora",false,19,50,123,6,34,true),
                new Lion("Leon",true,37,40,98,6,27,false)
        };
        for(Animal temp:animals) {
            System.out.println(temp);
        }
    }
}
