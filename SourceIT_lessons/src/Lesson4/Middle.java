package Lesson4;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Middle extends Treinee {
    private boolean knowledgeOfPatterns;


    @Override
    public void setName(String name) {
        if(name.startsWith("Mr."))
            super.setName(name);
        else
            System.out.printf("Middle is a boss\n");
    }
}
