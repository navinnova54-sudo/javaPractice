<<<<<<< HEAD
class StudentRecord {

    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        StudentRecord s = new StudentRecord();

        s.setRollNo(101);
        s.setName("Madhu");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
    }
}
=======
package Day11;

class StudentRecord {

    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        StudentRecord s = new StudentRecord();

        s.setRollNo(101);
        s.setName("Madhu");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
    }
}
>>>>>>> 4069ffd9053daecfbcb5f2c44c59f2f6ba579bec
