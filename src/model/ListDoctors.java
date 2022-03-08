/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.Specialization;

/**
 *
 * @author PCDELL
 */
public class ListDoctors {

    ArrayList<Doctor> ListDoctors;

    public ListDoctors(ArrayList<Doctor> ListDoctors) {
        this.ListDoctors = ListDoctors;
    }

    public ListDoctors() {
        ListDoctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getListDoctors() {
        return ListDoctors;
    }

    public void setListDoctors(ArrayList<Doctor> ListDoctors) {
        this.ListDoctors = ListDoctors;
    }

    public void addDoctor() {
        while (true) {
            System.out.println("Nhập (I) để insert doctor, Nhập (S) để dừng lại insert");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("s")) {
                break;
            } else if (option.equalsIgnoreCase("i")) {
                int count = 0;
                if (ListDoctors != null) {
                    for (int i = 0; i < ListDoctors.size(); i++) {
                        count++;
                    }
                }
                count++;
                Doctor d = new Doctor();
                d.setId(count);
                d.input();
                ListDoctors.add(d);
            } else {
                System.out.println("Chỉ nhập (I) hoặc (S)");
            }
        }
    }

    public void displayListDoctor() {
        for (Doctor d : ListDoctors) {
            System.out.println(d);
        }
    }

    public void deleteDoctor() {
        while (true) {
            System.out.println("Nhập (D) để tiếp tục xóa doctor, Nhập (S) để dừng lại delete");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("s")) break;
            else if (option.equalsIgnoreCase("d")) {
                System.out.println("Nhap id muon xoa");
                try{
                    
                int id = sc.nextInt();
                if(id>0){
                for (Doctor d : ListDoctors) {
                    if (d.getId() == id) {
                        ListDoctors.remove(d);
                    }
                }
                }else{
                    System.err.println("Nhap ID>0");
                }
                }catch(Exception e){
                    System.err.println("Nhap sai format id");
                }
            }
        }
    }
    public void SearchById() {
        while (true) {
            System.out.println("Nhập (sid) để SearchById, Nhập (S) để dừng lại Search id");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("s")) {
                break;
            } else if (option.equalsIgnoreCase("sid")) {
                System.out.println("Nhap id muon tim kiem: ");
                try {
                int id = sc.nextInt();
                int count = 0;
                if(id>0)
                for (Doctor d : ListDoctors) {
                    if (d.getId() == id) {
                        System.out.println("KQ search by ID:");
                        System.out.println(d);
                        count = 1;
                    }
                }else{
                    System.err.println("Id must be > 0");
                }
                if(count== 0){
                    System.err.println("Khong tim thay ID");
                    return;
                }
                } catch (Exception e) {
                    System.err.println("ID is not valid");
                }
                
            }
        }
    }
    public void SearchByName() {
        while (true) {
            System.out.println("Nhập (sn) để SearchByName, Nhập (S) để dừng lại Search Name");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("s")) {
                break;
            } else if (option.equalsIgnoreCase("sn")) {
                System.out.println("Nhap ten muon tim kiem: ");
                try {
                String Name = sc.nextLine();
                int count = 0;
                for (Doctor d : ListDoctors) {
                    if (d.getName().equals(Name)) {
                        System.out.println("KQ search by name:");
                        System.out.println(d);
                        count = 1;
                    }
                }
                if(count == 0){
                    System.out.println("Khong co ten trong danh sach");
                } 
                } catch (Exception e) {
                }
                
                
            }
        }
    }
    public void SortByDateOfBirth(){
        Collections.sort(ListDoctors);
    }
    public void editADoctorInfo(){
    while (true) {
            System.out.println("Nhập (ed) để edit a doctor, Nhập (S) để dừng lại");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("s")) {
                break;
            } else if (option.equalsIgnoreCase("ed")) {
                System.out.println("Nhap id muon edit Available: ");
                int id = sc.nextInt();
                for (Doctor d : ListDoctors) {
                    if (d.getId() == id) {
                        d.setAvailable(Validation.getInt(0, 4, "Nhap available"));   
                    }
                }
            }
        }
    }
    public void innitData(){
    Date Date1 = Validation.getDate2("dd/MM/yyyy","17/1/2022");
    Date Date2 = Validation.getDate2("dd/MM/yyyy","2/1/2022");
    Date Date3 = Validation.getDate2("dd/MM/yyyy","15/2/2022");
    
    ListDoctors.add(new Doctor(1, "Le van a",Date1, "Dong Y", "levana@gmail.com", "123-321-123", 3));
    ListDoctors.add(new Doctor(2, "Bui thi b",Date2, "Tay Y", "buithib@gmail.com", "123-321-123", 2));
    ListDoctors.add(new Doctor(3, "Nguyen van c",Date3, "Y hoc co truyen", "nguyenvanc@gmail.com", "123-321-123", 3));
    }

}
