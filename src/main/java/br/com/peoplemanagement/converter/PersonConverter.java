package br.com.peoplemanagement.converter;

import br.com.peoplemanagement.DTO.PersonDto;
import br.com.peoplemanagement.Data.PersonData;

import java.util.function.Function;

public class PersonConverter extends Converter<PersonData, PersonDto> {

    public PersonConverter(Function<PersonData, PersonDto> fromDto, Function<PersonDto, PersonData> fromEntity) {
        super(fromDto, fromEntity);
    }

    public PersonDto converterDataFromDto(PersonData person) {
        return new PersonDto(person.getUID(), person.getFirstName(), person.getLastName(), person.getCpf(), person.getEmail(), person.getBirthData());
    }

    public PersonData converterDtoFromData(PersonDto person) {
        return new PersonData(person.getUID(), person.getFirstName(), person.getLastName(), person.getCpf(), person.getEmail(), person.getBirthData());
    }
}
