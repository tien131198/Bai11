import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 12:05 AM
    
    ProjectName: Bai11
*/public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai bao doi tuong
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        // Nhap va hien thi
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(scanner);
        System.out.println(sp1);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(scanner);
        System.out.println(sp2);
        // cong 2 so phuc
        System.out.println(sp1.congSP(sp2));
        //nhan 2 so phuc
        System.out.println(sp1.nhanSP(sp2));
    }
}
