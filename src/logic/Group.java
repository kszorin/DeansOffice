package logic;

/**
 * Created by zorin on 23.01.2017.
 */
public class Group {
    private int id;
    private String name;
    private String curatorSurname;
    private String specialName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuratorSurname() {
        return curatorSurname;
    }

    public void setCuratorSurname(String curatorSurname) {
        this.curatorSurname = curatorSurname;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }

    @Override
    public String toString() {
        return name + " (" + specialName + ")";
    }
}