package th.ac.ku.cakeAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.cakeAPI.model.Cakes;
import th.ac.ku.cakeAPI.model.CakesOrder;
import th.ac.ku.cakeAPI.model.Certificate;
import th.ac.ku.cakeAPI.repository.CakesRepository;
import th.ac.ku.cakeAPI.repository.CertificateRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CertificateService {
    @Autowired
    private CertificateRepository repository;

    public List<Certificate> getAll(){
        return repository.findAll();
    }

    public Certificate create(Certificate certificate){
        repository.save(certificate);
        return certificate;
    }

    public Certificate getCertificate(UUID id){
        return repository.findById(id).get();
    }

    public Certificate update(UUID id, Certificate requestBody){
        Certificate record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setProdCertificateName(requestBody.getProdCertificateName());

        repository.save(record);
        return record;
    }

    public Certificate delete(UUID id){
        Certificate record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
