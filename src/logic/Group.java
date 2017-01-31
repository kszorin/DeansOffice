package logic;

/**
 * Created by zorin on 23.01.2017.
 */
public class Group {
    private int id;
    private String groupName;
    private String curatorName;
    private String specialName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCuratorName() {
        return curatorName;
    }

    public void setCuratorName(String curatorName) {
        this.curatorName = curatorName;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }

    @Override
    public String toString() {
        return groupName + " (" + specialName + ")";
    }
}