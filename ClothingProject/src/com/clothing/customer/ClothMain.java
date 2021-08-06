package com.clothing.customer;

import java.util.Scanner;

import com.clothing.exception.MaterialNotFoundException;
import com.clothing.model.Cloth;
import com.clothing.service.ClothDetails;
import com.clothing.service.ClothDetailsImpl;

public class ClothMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice:\n 1.Get Material By Id\n 2.Get Material by brand\n 3.Get All Clothes ");
		int choice = scanner.nextInt();
		ClothDetails clothing = new ClothDetailsImpl();
		switch (choice) {
		case 1:
			System.out.println("Enter the Material id");
			int id = scanner.nextInt();
			try {
				System.out.println(clothing.getById(id));

			} catch (MaterialNotFoundException e) {
				System.out.println(e.getMessage());

			}
			break;
		case 2:
			System.out.println("Enter the Brand name");
			String brand = scanner.next();
			try {
				Cloth[] clothByBrand = clothing.getByBrand(brand);
				for (Cloth cloth : clothByBrand) {
					if (cloth != null) {
						System.out.println(cloth);
					}
				}
			} catch (MaterialNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Available Materials:");
			Cloth[] cloths = clothing.getAll();
			for (Cloth cl : cloths) {
				System.out.println(cl);
			}
		}
		scanner.close();
	}
}
