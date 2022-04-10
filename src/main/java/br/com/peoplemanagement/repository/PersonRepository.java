package br.com.peoplemanagement.repository;

import br.com.peoplemanagement.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {

}
