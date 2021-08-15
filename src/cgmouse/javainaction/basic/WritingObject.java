package cgmouse.javainaction.basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class WritingObject {
    public void write(List<Student> studentList) {
		FileOutputStream f = null;
		ObjectOutputStream oos = null;
		try {// dat try cacth de tranh ngoai le khi tao va viet File
			f = new FileOutputStream(new File("student1.txt")); // tao file f tro den studen.txt
			oos = new ObjectOutputStream(f); // ghi Object vao file f
			oos.writeObject(studentList); // gho studentlist theo kieu object vao file
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeStream(f);
			closeStream(oos);
		}
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
