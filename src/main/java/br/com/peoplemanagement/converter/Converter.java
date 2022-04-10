package br.com.peoplemanagement.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class Converter<DATA, DTO> {

    private final Function<DATA, DTO> fromDto;
    private final Function<DTO, DATA> fromData;

    protected Converter(Function<DATA, DTO> fromDto, Function<DTO, DATA> fromEntity) {
        this.fromDto = fromDto;
        this.fromData = fromEntity;
    }

    public final DTO convertFromDto(final DATA data) {
        return fromDto.apply(data);
    }

    public final DATA convertFromData(final DTO dto) {
        return fromData.apply(dto);
    }

    public final List<DTO> createListFromDto(final Collection<DATA> dtos) {
        return dtos.stream().map(this::convertFromDto).collect(Collectors.toList());
    }

    public final List<DATA> createListFromData(final Collection<DTO> entities) {
        return entities.stream().map(this::convertFromData).collect(Collectors.toList());
    }
}
