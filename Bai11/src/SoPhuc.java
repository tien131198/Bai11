import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:48 PM
    
    ProjectName: Bai11
*/public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    // Nhap mot so phuc
    public void nhap(Scanner scanner){
        System.out.println("Nhap phan thuc");
        this.phanThuc = scanner.nextDouble();
        System.out.println("Nhap phan ao");
        this.phanAo = scanner.nextDouble();
    }
    // Nhan 2 so phuc
    public SoPhuc nhanSP(SoPhuc soPhuc){
        double thuc = this.phanThuc* soPhuc.phanThuc - this.phanAo*soPhuc.phanAo;
        double ao = this.phanThuc*soPhuc.phanAo + this.phanAo*soPhuc.phanThuc;
        return new SoPhuc(thuc,ao);
    }
    // Cong 2 so phuc
    public SoPhuc congSP(SoPhuc soPhuc){
        double thuc = this.phanThuc + soPhuc.phanThuc;
        double ao = this.phanAo + soPhuc.phanAo;
        return new SoPhuc(thuc,ao);
    }
    // Hien thi so phuc
    @Override
    public String toString() {
        return phanAo > 0 ? phanThuc + "+" + phanAo + "*i": phanThuc + "-" + Math.abs(phanAo) + "*i";
    }
}
