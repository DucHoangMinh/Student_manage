/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementprogram;
import java.util.Scanner;
/**
 *
 * @author HoangMinhDuc
 */

public class Student {
    Person a = new Person();
    private String maSinhVien;
    private double diemTB;
    private String email;

    public Student() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    private boolean laMaSinhVienHopLe ()
    {
        return maSinhVien.length()==8;
    }
    
    private boolean laDiemTBHopLe()
    {
        return diemTB>=0 && diemTB <=10;
    }
    
    private boolean laEmailHopLe()
    {
        return email.contains("@") && !email.contains(" ");
    }
    @Override
    public void inputInfo()
    {
        Scanner input = new Scanner(System.in);
        super.inputInfo();
        
        while (true)
        {
            System.out.print("Nhap ma sinh vien: ");
            this.setMaSinhVien(input.nextLine());
            if (laMaSinhVienHopLe() == true)
            {
                break;                
            }
            System.out.println("Ma sinh vien phai du 8 ki tu");
        }
        
        while (true)
        {
            System.out.print("Nhap diem TB: ");
            this.setDiemTB(input.nextDouble());
            input.nextLine();
            if (laDiemTBHopLe()== true)
            {
                break;                
            }
            System.out.println("Diem trung binh phai tu 0 den 10");
        }
        
        while (true)
        {
            System.out.print("Nhap email: ");
            this.setEmail(input.nextLine());
            if (laEmailHopLe()== true)
            {
                break;                
            }
            System.out.println("Email phai chua ki tu @ va khong co khoang trang");
        }
    }
    
    public boolean coHocBong()
    {
        return this.diemTB >= 8;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + 
                "\nMa sinh vien: " + this.maSinhVien +
                "\nDiem TB: " + this.diemTB +
                "\nEmail: " + this.email +
                (coHocBong()?"\nSinh vien dat hoc bong":"");
    }
    
    public void showInfo(){
        System.out.println(this.toString());
    }

    String getTen() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
