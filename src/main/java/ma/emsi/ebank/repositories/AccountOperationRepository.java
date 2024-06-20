package ma.emsi.ebank.repositories;

import ma.emsi.ebank.entities.AccountOperation;
import ma.emsi.ebank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository <AccountOperation,Long> {

}
