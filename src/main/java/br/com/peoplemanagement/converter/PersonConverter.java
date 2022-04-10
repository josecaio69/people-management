package br.com.peoplemanagement.converter;

import br.com.peoplemanagement.DTO.PersonDto;
import br.com.peoplemanagement.Data.PersonData;

import java.util.function.Function;

public class PersonConverter extends Converter<PersonData, PersonDto> {

    protected PersonConverter(Function<PersonData, PersonDto> fromDto, Function<PersonDto, PersonData> fromEntity) {
        super(fromDto, fromEntity);
    }
}
