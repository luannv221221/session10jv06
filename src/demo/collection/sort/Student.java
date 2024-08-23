package demo.collection.sort;

public class Student implements Comparable<Student> {
    private String studentCode;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(String studentCode, String studentName, int age) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student student) {
        // sắp xếp tuổi tăng dần
        return this.age - student.age;

        // sắp xếp theo tuổi giảm dần
//        return student.age - this.age;
    }

}
