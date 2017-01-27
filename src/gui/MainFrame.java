package gui;

import logic.Group;
import logic.ManageSystem;

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

        //Верхняя панель - для установки года
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout(FlowLayout.LEFT));
        top.add (new JLabel("Год обучения"));
        SpinnerModel sm = new SpinnerNumberModel(2006, 1900, 2100, 1);
        JSpinner spYear = new JSpinner(sm);
        top.add(spYear);

        //Нижняя панель - контейнер
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        //Левая нижняя панель - список групп
        JPanel leftbottom = new JPanel();
        leftbottom.setLayout(new BorderLayout());
        leftbottom.setBorder(new BevelBorder(BevelBorder.RAISED));

        Vector<Group> gr = new Vector<Group>(ms.getGroups());

        //Правая нижняя панель - список студентов
        JPanel rightbottom = new JPanel();
        rightbottom.setLayout(new BorderLayout());
        rightbottom.setBorder(new BevelBorder(BevelBorder.RAISED));


        //Вставляем левую и правую панели в нижнюю
        bottom.add(leftbottom);
        bottom.add(rightbottom);


        // Вставляем верхнюю и нижнюю панели в форму
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
