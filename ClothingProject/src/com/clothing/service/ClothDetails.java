package com.clothing.service;

import com.clothing.exception.MaterialNotFoundException;
import com.clothing.model.Cloth;

public interface ClothDetails {
	Cloth getById(int id) throws MaterialNotFoundException;

	Cloth[] getAll();

	Cloth[] getByBrand(String brand) throws MaterialNotFoundException;

	
}
