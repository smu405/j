public class StudentDB {
    enum FindGPAParam { LOWER_THAN, HIGHER_THAN }

    Student[] students;
    int count;

    StudentDB() {
        students = new Student[3];
        count = 0;
    }

    void add(Student student) {
        students[count] = student;
        count++;
    }

    void add(String name, int num, double gpa) {
        students[count] = new Student(name, num, gpa);
        count++;
    }

    Student findBy(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(int number) {
        for (int i = 0; i < count; i++) {
            if (students[i].getNumber() == number) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(double gpa) {
        for (int i = 0; i < count; i++) {
            if (students[i].getGPA() == gpa) {
                return students[i];
            }
        }
        return null;
    }

    Student findBy(FindGPAParam param, double gpa) {
        for (int i = 0; i < count; i++) {
            if (param == FindGPAParam.HIGHER_THAN) {
                if (students[i].getGPA() > gpa) {
                    return students[i];
                }
            }
            else if (param == FindGPAParam.LOWER_THAN) {
                if (students[i].getGPA() < gpa) {
                    return students[i];
                }
            }
        }
        return null;
    }
}
