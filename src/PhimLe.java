import java.util.Scanner;

public class PhimLe {
	String name;
	int time;
	String dienvien;
	String ghichu;
	
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Moi nhap ten phim: ");
		name=input.nextLine();
		System.out.println("Moi nhap thoi luong: ");
		time=input.nextInt();
		System.out.println("Moi nhap dien vien: ");
		dienvien=input.nextLine();
		System.out.println("Moi nhap Ghi chu: ");
		ghichu=input.nextLine();
		
	}
	public void showinfo() {
		System.out.println("Phim: "+name+"     "+"Thoi Luong: "+time+"     "+"Dien Vien: "+dienvien);
	}
	

}
