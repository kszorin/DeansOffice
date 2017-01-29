package gui;

import logic.Group;
import logic.ManageSystem;
import logic.Student;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.Vector;

/**
 * Created by zorin on 27.01.2017.
 */
public class MainFrame extends JFrame {
    private ManageSystem ms = ManageSystem.getInstance();

    public MainFrame() {
        getContentPane().setLayout(new BorderLayout());

        //Верхняя панель (установка года)
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout(FlowLayout.LEFT));
        top.add (new JLabel("Год обучения"));
        SpinnerModel sm = new SpinnerNumberModel(2006, 1900, 2100, 1);
        JSpinner spYear = new JSpinner(sm);
        top.add(spYear);

        //Нижняя панель-контейнер (содержит левую и правую панель)
        JPanel bottom = new JPanel();
        bottom.setLayout(new BoxLayout(bottom,BoxLayout.X_AXIS));

        //Левая нижняя панель (список групп)
        JPanel leftbottom = new JPanel();
        leftbottom.setLayout(new BorderLayout());
        leftbottom.setBorder(new BevelBorder(BevelBorder.RAISED));
        Vector<Group> gr = new Vector<Group>(ms.getGroups());
        leftbottom.add(new JLabel("Группы:"), BorderLayout.NORTH);
        JList<Group> grList = new JList<Group>(gr);
        leftbottom.add(new JScrollPane(grList), BorderLayout.CENTER);

        //Правая нижняя панель - список студентов
        JPanel rightbottom = new JPanel();
        rightbottom.setLayout(new BorderLayout());
        rightbottom.setBorder(new BevelBorder(BevelBorder.RAISED));
        Vector<Student> st = new Vector<Student>(ms.getStudents());
        rightbottom.add(new JLabel("Студенты:"), BorderLayout.NORTH);
        JList<Student> stList = new JList<Student>(st);
        rightbottom.add(new JScrollPane(stList), BorderLayout.CENTER);

        //Вставляем левую и правую панели в нижнюю панель
        bottom.add(leftbottom);
        bottom.add(rightbottom);

        //Вставляем верхнюю и нижнюю панели в форму
        getContentPane().add(top, BorderLayout.NORTH);
        getContentPane().add(bottom, BorderLayout.CENTER);

        // Задаем границы формы
        setBounds(100, 100, 600, 400);
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                mf.setVisible(true);
            }
        });
    }
}
