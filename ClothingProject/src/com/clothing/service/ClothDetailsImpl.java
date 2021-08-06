package com.clothing.service;

import com.clothing.exception.MaterialNotFoundException;
import com.clothing.model.Cloth;

public class ClothDetailsImpl implements ClothDetails {
	@Override
	public Cloth getById(int id) throws MaterialNotFoundException {
		Cloth[] cloths = allMaterials();
		for (Cloth m : cloths) {
			if (m.getMaterialId() == id) {
				return m;
			}
		}
		throw new MaterialNotFoundException("Mobile Not Found");
	}

	@Override
	public Cloth[] getAll() {
		return allMaterials();
	}

	@Override
	public Cloth[] getByBrand(String brand) throws MaterialNotFoundException {
		Cloth[] materials = allMaterials();
		Cloth[] clothBrand = new Cloth[7];
		int index = 0, flag = 0;
		for (Cloth mat : materials) {
			if (mat.getBrand().equals(brand)) {
				clothBrand[index++] = mat;
				flag = 1;
			}
		}
		if (flag == 0) {
			throw new MaterialNotFoundException("Mobile Not Found");
		}
		return clothBrand;

	}

	private Cloth[] allMaterials() {
		Cloth[] material = new Cloth[7];
		material[0] = new Cloth(1, "Cotton", "FENDI", 10000);
		material[1] = new Cloth(2, "Silk", "BURBERRY", 20000);
		material[2] = new Cloth(3, "Wool", "GUCCI", 30000);
		material[3] = new Cloth(4, "Nylon", "LOUIS ", 40000);
		material[4] = new Cloth(5, "Georgette", "CHANEL ", 50000);
		material[5] = new Cloth(6, "Chiffon", "BURBERRY ", 60000);
		material[6] = new Cloth(7, "Linen", "ARMANI ", 70000);
		return material;

	}

}
