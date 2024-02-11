package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.PlacementRepositoryImpl;
import com.cg.placement.repository.IPlacementRepository;

public class PlacementServiceImpl implements IPlacementService {
	// Step 1: Establishing connection between Service and Repo
	private IPlacementRepository dao;

	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
	}

	// Step 2: Service calls to perform CRUD Operation

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		dao.beginTransaction();
		dao.deletePlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

}
