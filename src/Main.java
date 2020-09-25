import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		ArrayList<PhimBo> listphimbo=new ArrayList<>();
		ArrayList<PhimLe> listphimle=new ArrayList<>();
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(input.nextLine());
			int n;
			
			switch(choose) {
			
			case 1:
				System.out.println("=====.PHIM BO.=====");
				for(int i=0;i<listphimbo.size();i++) {
					listphimbo.get(i).show();
				}
				break;
			case 2:
				System.out.println("=====PHIM LE=====");
				break;
				
			case 3:
				System.out.println("=====QUAN LY PHIM LE=====");
				System.out.println("Moi nhap so phim muon them: ");
				n=Integer.parseInt(input.nextLine());
				for(int i=0;i<n;i++) {
					PhimLe phimle=new PhimLe();
					phimle.input();
					listphimle.add(phimle);
				}
				break;
			case 4:
				System.out.println("===== QUAN LY PHIM BO =====");
				System.out.println("Moi nhap so bo phim muon them: ");
				n=Integer.parseInt(input.nextLine());
				for (int i=0;i<n;i++) {
					PhimBo phimbo=new PhimBo();
					phimbo.input();
					listphimbo.add(phimbo);
					
				}

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
 