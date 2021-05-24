public class Student {
    private String sname;
    private String ssex;

    public Student(String sname, String ssex) {
        this.sname = sname;
        this.ssex = ssex;
    }

    public Student() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
