package cgmouse.javainaction.basic;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadingObject {
    public List<Student> read() {
        List<Student> studentList = new ArrayList<>();
        FileInputStream f = null;
        ObjectInputStream ois = null;
        try {// dat try cacth de tranh ngoai le khi tao va viet File
            f = new FileInputStream(new File("Student1.txt"));// tao file f tro den student.txt
            ois = new ObjectInputStream(f); // dung de doc theo Object vao file f
            studentList = (List<Student>) ois.readObject();
        } catch (EOFException eofException) {
            System.out.println("Danh sách rỗng!!!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            closeStream(f);
            closeStream(ois);
        }
        return studentList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // dong Output stream
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
