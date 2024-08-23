import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inputkan nama siswa");
        String nama = input.nextLine();
        System.out.println("masukan id siswa");
        int id = input.nextInt();
        System.out.print("masukan ipk");
        double ipk = input.nextDouble();

        siswa kon = new siswa(id, nama, ipk);
        kon.print();

    }
}