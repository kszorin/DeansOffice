package logic;

import java.util.Collection;

/**
 * Created by zorin on 23.01.2017.
 */
public class ManageSystem {
    private Collection<Group> groups;
    private Collection<Student> students;
    private static ManageSystem instance;

    private ManageSystem () {

    }

    public static ManageSystem getInstance() {
        if (instance == null)
            instance = new ManageSystem();
        return instance;
    }

    public static void main (String[] args) {

    }
}
