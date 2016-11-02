package imp1.exam;

import api.exam.*;

import java.util.*;

/**
 * Created by denis.selutin on 29.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Service service = null;//your init here

        List<Them> thems = Arrays.asList(/* your init here*/);
        for(Them th: thems) {
            service.addThem(th);
        }

        List<Question> quesitons = Arrays.asList(/*your init here*/);
        for(Question q: quesitons) {
            service.addQuestion(q);
        }

        Test t = service.createRandomTest();
        assertCondition(t != null);
        assertCondition(t.getAnswers() != null);
        assertCondition(t.getAnswers().size() > 0);
        assertCondition(t.getNumber() != null);
        assertCondition(t.getNumber() > 0);
        assertCondition(t.getQuestions() != null);
        assertCondition(t.getQuestions().size() > 0);

        Map<String, List<Integer>> answers = new HashMap<>();
        int numberOfCorrect = 0;
        int numberOfInCorrect = 0;
        Random r = new Random();
        for(Question q : t.getQuestions()) {
            if(numberOfCorrect == 0) {
                answers.put(q.getName(), q.getCorrectAnswers());
                numberOfCorrect++;
                continue;
            }
            if(numberOfInCorrect == 0) {
                answers.put(q.getName(), Collections.EMPTY_LIST);
                numberOfInCorrect++;
                continue;
            }
            if(r.nextBoolean()) {
                answers.put(q.getName(), q.getCorrectAnswers());
                numberOfCorrect++;
            } else {
                answers.put(q.getName(), Collections.EMPTY_LIST);
                numberOfInCorrect++;
            }
        }

        TestResult tr = service.performTest(t, answers);
        assertCondition(tr.getNumberOfCorrectAnswers() == numberOfCorrect);
        assertCondition(tr.getNumberOfIncorrectAnswers() == numberOfInCorrect);
        assertCondition(tr.getNumberOfQuestions() == t.getQuestions().size());
    }

    private static void assertCondition(boolean condition) {
        assert condition;
        if(!condition) {
            throw new RuntimeException("HERE!!!");
        }
    }
}
/*
Привет!

Высылаю в качестве ознакомления задание на сегодня.
1) интерфейсы не менять
2) реализовать классы и добавить создание обьектов в мейн

Тема - Экзамен
Базовые компоненты - тема и вопрос. Каждый вопрос содержит тему, название (сам вопрос в текстовом виде),
    варианты ответа в текстовом виде и правильные ответы в виде списка индексов из вариантов ответов.
Тест - набор вопросов + порядкой номер теста.
Результат теста - тсатистика по правльно отвеченым и неправильно отвеченым вопросам.
Сервис - логика обработки теста и предоставленных ответов.

Вопрос
    - название
    - тема
    - варианты ответа
    - правильные варианты ответа
Тема
    - название
    - описание
Тест
    - номер
    - вопросы
    - правильные ответы(только номера ответов)
Результаты теста
    - количество правильных ответов
    - количество вопросов
    - количество неправильных ответов
 Сервис
    - создать произвольный тест
    - добавить вопрос
    - провести тест(передаем тест, и ответы выдаем результат)
 */
