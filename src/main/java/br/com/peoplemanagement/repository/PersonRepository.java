package br.com.peoplemanagement.repository;

import br.com.peoplemanagement.Data.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<PersonData, UUID> {

}
