package attendancemanagementsystem2;

public class Dets {

    private int Uage,Uid;
    private String  Ufname, Umname, Ulname, Ugender, Ucourse, Ustatus;

    public Dets(int id, int age, String fname, String mname, String lname, String gender, String course, String status) {
        this.Uid = id;
        this.Uage = age;
        this.Ufname = fname;
        this.Umname = mname;
        this.Ulname = lname;
        this.Ugender = gender;
        this.Ucourse = course;
        this.Ustatus = status;
    }

    public int getId() {
        return this.Uid;
    }

    public void setId(int id) {
        this.Uid = id;
    }

    public int getAge() {
        return this.Uage;
    }

    public void setAge(int age) {
        this.Uage = age;
    }

    public String getFname() {
        return this.Ufname;
    }

    public void setFname(String fname) {
        this.Ufname = fname;
    }

    public String getMname() {
        return this.Umname;
    }

    public void setMname(String mname) {
        this.Umname = mname;
    }

    public String getLname() {
        return this.Ulname;
    }

    public void setLname(String lname) {
        this.Ulname = lname;
    }

    public String getGender() {
        return this.Ugender;
    }

    public void setGender(String gender) {
        this.Ugender = gender;
    }

    public String getCourse() {
        return this.Ucourse;
    }

    public void setCourse(String course) {
        this.Ucourse = course;
    }

    public String getStatus() {
        return Ustatus;
    }

    public void setStatus(String status) {
        this.Ustatus = status;
    }
    }   