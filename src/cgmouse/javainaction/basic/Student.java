package cgmouse.javainaction.basic;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private int ID;
    private String name;
    private int age;
    
    public Student(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

	public int getId() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void addst() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID: ");
	    this.ID = Integer.parseInt(sc.nextLine());
	    System.out.print("Nhap Ten Hoc Sinh: ");
	    this.name = sc.nextLine();
	    System.out.print("Nhap tuoi: ");
	    this.age =  Integer.parseInt(sc.nextLine());
	       
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", age=" + age + "]";
	}
}
