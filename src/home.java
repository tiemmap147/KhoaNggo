import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("=====Cine.vn=====");
			System.out.println("1. Phim Bo");
			System.out.println("2. Phim Le");
			System.out.println("3. Phim chieu rap");
			System.out.println("4. Them Phim");
			System.out.println("5. Thoat");
			System.out.println("Moi ban nhap lua chon: ");
			luachon=Integer.parseInt(sc.nextLine());
			switch(luachon) {
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
				n=Integer.parseInt(sc.nextLine());
				for (int i=1;i<=n;i++){
					System.out.println("Moi nhap ten phim: ");
					String tenphim=sc.nextLine();

				}

				break;
			case 5:
				System.out.println("Goodbyee");
				break;
			default:
				System.out.println("Nhap sai, Moi nhap lai");
			}
		}while(luachon != 5);

	}

}
