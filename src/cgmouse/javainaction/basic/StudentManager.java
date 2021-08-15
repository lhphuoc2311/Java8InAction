package cgmouse.javainaction.basic;

import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private List<Student> studentList;
    private ReadingObject readingObject;
    private WritingObject writingObject;

    public StudentManager() {
        readingObject = new ReadingObject();
        writingObject = new WritingObject();
        studentList = readingObject.read();
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        String traloi;
        String name = null;
        int ID = 0;
        int age = 0;
        do {
            Student st = new Student(ID, name, age);
            st.addst();
            studentList.add(st);
            writingObject.write(studentList);
            System.out.print("Bạn có muốn nhập tiếp hay không <t/k>?");
            traloi = sc.nextLine();
        } while (traloi.equals("t"));
    }

    public void inDanhSach() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    // tim Sinh vien bang ID
    public String TimBangID(int ID) {
        String data = "Khong Tim Thay Hoc Sinh";
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == ID) {
                data = studentList.get(i).toString();
            }
        }
        return data;
    }

}
