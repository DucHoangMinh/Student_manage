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
public class Person {
    private String ten;
    private boolean laNam;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, boolean laNam, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.laNam = laNam;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isLaNam() {
        return laNam;
    }

    public void setLaNam(boolean laNam) {
        this.laNam = laNam;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void inputInfo (){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ho ten: ");        
        this.setTen(input.nextLine());
        
        while (true)
        {
            System.out.print("Gioi tinh (nam/nu): ");
            String tmp = input.nextLine();
            if (tmp.equalsIgnoreCase("nam"))
            {
                this.setLaNam(true);
                break;
            }
            else if (tmp.equalsIgnoreCase("nu"))
            {
                this.setLaNam(false);
                break;
            }
            System.out.println("Chi nhap nam hoac nu!!!");
        }
        
        System.out.print("Ngay sinh: ");
        this.setNgaySinh(input.nextLine());
        
        System.out.print("Dia chi: ");
        this.setDiaChi(input.nextLine());
    }
    
    public String getGioiTinh ()
    {
        return laNam?"Nam":"Nu";
    }

    @Override
    public String toString() {
        return "Ten: " + ten + 
                "\nGioi tinh: " + getGioiTinh() + 
                "\nNgay sinh: " + ngaySinh + 
                "\nDia chi: " + diaChi;
    }
    
    public void showInfo(){
        System.out.println(this.toString());
    }

}
