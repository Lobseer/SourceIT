package Lesson4;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Treinee extends Developer {
    private boolean knowledgeOfJavaBasic;
    private boolean knowledgeOfJavaCollection;
    private boolean knowledgeOfSql;
    private boolean knowledgeOfServletApi;

    public boolean isKnowledgeOfJavaBasic() {
        return knowledgeOfJavaBasic;
    }

    public void setKnowledgeOfJavaBasic(boolean knowledgeOfJavaBasic) {
        this.knowledgeOfJavaBasic = knowledgeOfJavaBasic;
    }

    public boolean isKnowledgeOfJavaCollection() {
        return knowledgeOfJavaCollection;
    }

    public void setKnowledgeOfJavaCollection(boolean knowledgeOfJavaCollection) {
        this.knowledgeOfJavaCollection = knowledgeOfJavaCollection;
    }

    public boolean isKnowledgeOfSql() {
        return knowledgeOfSql;
    }

    public void setKnowledgeOfSql(boolean knowledgeOfSql) {
        this.knowledgeOfSql = knowledgeOfSql;
    }

    public boolean isKnowledgeOfServletApi() {
        return knowledgeOfServletApi;
    }

    public void setKnowledgeOfServletApi(boolean knowledgeOfServletApi) {
        this.knowledgeOfServletApi = knowledgeOfServletApi;
    }



    @Override
    public String toString() {
        return "This is "
                +getName()
                +" and he is "
                +getClass().getName()
                +" with salary "
                +salary;
    }
}
