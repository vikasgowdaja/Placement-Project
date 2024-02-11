package com.cg.placement.service;

import com.cg.placement.entities.Certificate;

public interface ICertificateService {
	public Certificate addCertificate(Certificate certificate);

	public Certificate updateCertificate(Certificate certificate);

	public Certificate searchCertificate(int id);

	public Certificate deleteCertificate(Certificate certificate);
}
