import java.util.Scanner;

public class PhimBo {
	String name;
	int ep;
	String dienvien;
	public void input() {
		Scanner input =new Scanner(System.in);
		System.out.println("Ten phim: ");
		name=input.nextLine();
		System.out.println("So tap: ");
		ep=input.nextInt();
		System.out.println("Moi nhap dien vien: ");
		dienvien=input.nextLine();
	}
	public void show() {
		System.out.println("Phim: "+name+" "+ep+" tap");
	}

}
