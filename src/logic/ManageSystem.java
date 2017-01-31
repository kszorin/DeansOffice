package logic;

import java.util.*;

/**
 * Created by zorin on 23.01.2017.
 */
public class ManageSystem {
    private Collection<Group> groups;
    private Collection<Student> students;
    private static ManageSystem instance;

    private ManageSystem () {
        //тестовое заполнение данными
        loadGroups();
        loadStudents();
    }

    //организовываем синглтон
    public static ManageSystem getInstance() {
        if (instance == null)
            instance = new ManageSystem();
        return instance;
    }

    //тестовое наполнение групп
    private void loadGroups() {
        if (null == groups)
            groups = new ArrayList<Group>();
        else
            groups.clear();

        Group g = new Group();
        g.setId(1);
        g.setGroupName("204");
        g.setSpecialName("Системы информатики");
        g.setCuratorName("доцент Иванова");
        groups.add(g);

        g = new Group();
        g.setId(2);
        g.setGroupName("202");
        g.setSpecialName("Компьютерная графика");
        g.setCuratorName("профессор Утюгов");
        groups.add(g);
    }

    //тестовое наполнение студентов
    private void loadStudents() {
        if (null == students)
            students = new TreeSet<Student>();
        else
            students.clear();
        Calendar calendar = Calendar.getInstance();

        Student s = new Student();
        s.setId(1);
        s.setSurname("Иванов");
        s.setFirstname("Олег");
        s.setPatronimic("Сергеевич");
        calendar.set(1987,9,1);
        s.setBirthday(calendar.getTime());
        s.setSex('М');
        s.setGroupId(1);
        students.add(s);

        s = new Student();
        s.setId(2);
        s.setSurname("Жабова");
        s.setFirstname("Юлия");
        s.setPatronimic("Эдуардовна");
        calendar.set(1987,2,10);
        s.setBirthday(calendar.getTime());
        s.setSex('Ж');
        s.setGroupId(2);
        students.add(s);

        s = new Student();
        s.setId(3);
        s.setSurname("Кутузов");
        s.setFirstname("Аркадий");
        s.setPatronimic("Прокопьевич");
        calendar.set(1986,3,5);
        s.setBirthday(calendar.getTime());
        s.setSex('М');
        s.setGroupId(1);
        students.add(s);
    }

    //Получаем список групп
    public Collection<Group> getGroups() {
        return groups;
    }

    //Получаем список студентов
    public Collection<Student> getStudents() {
        return students;
    }

    //Получить список студентов, учащихся в определённой группе.
    public Collection<Student> getStudentsFromGroup (Group group) {
        TreeSet<Student> s = new TreeSet<Student>();
        for (Student si:students) {
            if (si.getGroupId() == group.getId())
                s.add(si);
        }
        return s;
    }

    //Добавить студента
    public void addStudent (Student s) {
        students.add(s);
    }

    //Удалить студента
    public void deleteStudent (Student s) {
        students.remove(s);
    }

    //Обновить данные о студенте
    public void updateStudent (Student s) {
        for (Student si:students) {
            if (si.getId() == s.getId()) {
                si.setSurname(s.getSurname());
                si.setFirstname(s.getFirstname());
                si.setPatronimic(s.getPatronimic());
                si.setGroupId(s.getGroupId());
                break;
            }
        }
    }

    /*public static void main (String[] args) {
        ManageSystem ms = ManageSystem.getInstance();

        System.out.println("*** Исходный список всех студентов: ***");
        for (Student k:ms.getStudents())
            System.out.println(k);

        System.out.println("*** Исходнй список всех групп: ***");
        for (Group g:ms.getGroups())
            System.out.println(g);
    }*/
}
