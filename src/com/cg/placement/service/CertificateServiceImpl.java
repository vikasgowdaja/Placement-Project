package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.CertificateRepositoryImpl;
import com.cg.placement.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService
{
	// Step 1: Establishing connection between Service and Repo
	private ICertificateRepository dao;
	
	public CertificateServiceImpl() 
	{
		dao = new CertificateRepositoryImpl();
	}
	
	// Step 2: Service calls to perform CRUD Operation

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) 
	{
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		dao.deleteCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}

}
