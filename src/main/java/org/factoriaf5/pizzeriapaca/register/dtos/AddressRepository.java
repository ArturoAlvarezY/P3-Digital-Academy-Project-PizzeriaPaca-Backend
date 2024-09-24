package org.factoriaf5.pizzeriapaca.register.dtos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findByCustomerId(Long customerId);
}
