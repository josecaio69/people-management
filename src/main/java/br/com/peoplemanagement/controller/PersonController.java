package br.com.peoplemanagement.controller;

import br.com.peoplemanagement.DTO.PersonDto;
import br.com.peoplemanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/create")
    public ResponseEntity<PersonDto> createNewPerson(PersonDto personDto){

        return null;
    }


}
