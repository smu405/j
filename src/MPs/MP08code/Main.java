public class Main {
    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB();
        Student s = new Student("김지우", 201911111, 4.01);
        studentDB.add(s);
        studentDB.add("이민준", 201922222, 3.85);
        studentDB.add("박서윤", 201933333, 3.90);
        s = studentDB.findBy("김지우");
        System.out.println(s);
        s = studentDB.findBy(201922222);
        System.out.println(s);
        s = studentDB.findBy(3.90);
        System.out.println(s);
        s = studentDB.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95);
        System.out.println(s);
        s = studentDB.findBy(StudentDB.FindGPAParam.HIGHER_THAN, 3.95);
        System.out.println(s);
    }
}
