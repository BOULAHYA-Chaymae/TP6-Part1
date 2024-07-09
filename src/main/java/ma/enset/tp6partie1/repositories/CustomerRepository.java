package ma.enset.tp6partie1.repositories;

import ma.enset.tp6partie1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
