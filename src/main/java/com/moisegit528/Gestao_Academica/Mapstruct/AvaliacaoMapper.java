package com.moisegit528.Gestao_Academica.Mapstruct;

import com.moisegit528.Gestao_Academica.Dto.request.AvaliacaoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AvaliacaoResponse;
import com.moisegit528.Gestao_Academica.Model.AvaliacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AvaliacaoMapper {

    AvaliacaoEntity avaliacaoEntity(AvaliacaoRequest requestAvaliacao); //converting request to entity
    @Mapping(target = "turma", source = "turma.codigoTurma")
    AvaliacaoResponse response(AvaliacaoEntity entity);
    List<AvaliacaoResponse> avaliacaoResponse(List<AvaliacaoEntity> list); // converting list entity to list response
}
