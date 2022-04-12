/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementprogram;
import java.util.ArrayList;
/**
 *
 * @author HoangMinhDuc
 */
public class StudentList {
    ArrayList<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }
    
    public void inputInfo (int soLuongSinhVien)
    {
        for (int i=0; i<soLuongSinhVien; i++)
        {
            System.out.println("Nhap sinh vien thu " + (i+1));
            Student tmp = new Student();
            tmp.inputInfo();
            students.add(tmp);
        }
    }
    
    public void showInfo()
    {
        for (Student x: students)
        {
            x.showInfo();
            System.out.println("");
        }
    }
    
    public String getSinhVienByDiem (double diem)
    {
        String ketQua = "";
        for (Student x: students)
        {
            if (x.getDiemTB() == diem)
                ketQua += (x.getTen() + " ");
        }
        return ketQua;
    }
    
    public double getMaxDiem ()
    {
        if (students.size() == 0)
            return -1;
        double max = students.get(0).getDiemTB();
        for (Student x: students)
        {
            if (x.getDiemTB() > max)
            {
                max = x.getDiemTB();
            }
        }
        return max;
    }
    
    public double getMinDiem ()
    {
        if (students.size() == 0)
            return -1;
        double min = students.get(0).getDiemTB();
        for (Student x: students)
        {
            if (x.getDiemTB() < min)
            {
                min = x.getDiemTB();
            }
        }
        return min;
    }
    
    public int getStudentIndex (String maSinhVien)
    {
        for (int i=0; i<students.size(); i++)
        {
            if (students.get(i).getMaSinhVien()
                    .equalsIgnoreCase(maSinhVien))
            {
                return i;
            }
        }
        return -1;
    }
    
    public Student getSinhVien (String MaSinhVien)
    {
        for (Student x: students)
        {
            if (x.getMaSinhVien()
                    .equalsIgnoreCase(MaSinhVien))
                return x;
        }
        return null;
    }
    
    public void sortAlphabetAtoZ ()
    {
        for (int i=0; i<students.size()-1; i++)
        {
            for (int j=i+1; j<students.size(); j++)
            {
                if (students.get(i).getTen()
                    .compareTo(students.get(j).getTen())>0)
                {
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                }
            }
        }
    }
    
    public void showSinhVienCoHocBong ()
    {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        
        //LÆ°u 1 máº£ng gá»“m sinh viÃªn cÃ³ há»c bá»•ng
        for (Student x: students)
        {
            if (x.coHocBong())
                scholarshipStudents.add(x);
        }
        
        //Sáº¯p xáº¿p Ä‘iá»ƒm giáº£m dáº§n
        for (int i=0; i<scholarshipStudents.size()-1; i++)
        {
            for (int j=i+1; j<scholarshipStudents.size(); j++)
            {
                if (scholarshipStudents.get(i).getDiemTB() <
                        scholarshipStudents.get(j).getDiemTB())
                {
                    Student tmp = scholarshipStudents.get(i);
                    scholarshipStudents.set(i, scholarshipStudents.get(j));
                    scholarshipStudents.set(j, tmp);
                }
            }
        }
        
        //Hiá»ƒn thá»‹ cÃ¡c sinh viÃªn cÃ³ há»c bá»•ng
        for (Student x: scholarshipStudents)
        {
            x.showInfo();
            System.out.println("");
        }
    }
    

}
