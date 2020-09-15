import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(input.nextLine());
			
			switch(choose) {
			
			case 1:
				System.out.println("=====.PHIM BO.=====");
				break;
			case 2:
				System.out.println("=====PHIM LE=====");
				break;
				
			case 3:
				System.out.println("=====PHIM CHIEU RAP=====");
				break;
			case 4:
				int n;
				System.out.println("=====QUAN LY PHIM=====");
				System.out.println("Moi nhap so bo phim muon them: ");

				break;
			case 5:
				System.out.println("Goodbyee");
				break;
			default:
				System.out.println("Nhap sai, Moi nhap lai");
				break;
			}
		}while(choose != 5);

	}
	public static void showMenu() {
		System.out.println("=====Cine.vn=====");
		System.out.println("1. Phim Bo");
		System.out.println("2. Phim Le");
		System.out.println("3. Phim chieu rap");
		System.out.println("4. Them Phim");
		System.out.println("5. Thoat");
		System.out.println("Moi ban nhap lua chon: ");
	}

}
 