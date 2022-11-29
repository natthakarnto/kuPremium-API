package th.ac.ku.cakeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.cakeAPI.model.Cakes;
import th.ac.ku.cakeAPI.model.Certificate;

import java.util.UUID;

public interface CertificateRepository extends JpaRepository<Certificate, UUID> {
}
