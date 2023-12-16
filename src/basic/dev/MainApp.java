package basic.dev;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        // Nhập chuỗi từ bàn phím
	        System.out.print("Nhap vao mot chuoi: ");
	        String chuoi = sc.nextLine();
	        
	        // Đảo ngược chuỗi
	        String chuoiDaoNguoc = new StringBuilder(chuoi).reverse().toString();
	        System.out.println("Chuoi dao nguoc: " + chuoiDaoNguoc);
	        
	        // Đếm số từ trong chuỗi
	        String[] mangTu = chuoi.split("\\s+");
	        System.out.println("So tu trong chuoi: " + mangTu.length);
	        
	        // Tìm từ xuất hiện nhiều nhất trong chuỗi
	        Map<String, Integer> demTu = new HashMap<>();
	        for (String tu : mangTu) {
	            demTu.put(tu, demTu.getOrDefault(tu, 0) + 1);
	        }
	        
	        String tuXuatHienNhieuNhat = Collections.max(demTu.entrySet(), Map.Entry.comparingByValue()).getKey();
	        System.out.println("Tu xuat hien nhieu nhat trong chuoi: " + tuXuatHienNhieuNhat);

	}

}
