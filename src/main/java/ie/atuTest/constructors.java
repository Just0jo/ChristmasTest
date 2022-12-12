package ie.atuTest;

public class constructors {
    private String Name;
    private String PPS_ID;
    private String Type;




    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPPS_ID() {
        return PPS_ID;
    }

    public void setPPS_ID(String PPS_ID) {
        this.PPS_ID = PPS_ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

    @Override
    public String toString() {
        return "constructors{" +
                "Name='" + Name + '\'' +
                ", PPS_ID='" + PPS_ID + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }










