package com.moisegit528.Gestao_Academica.Mapstruct;

import com.moisegit528.Gestao_Academica.Dto.request.AvaliacaoRequest;
import com.moisegit528.Gestao_Academica.Model.AvaliacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AvaliacaoMapper {

    AvaliacaoEntity avaliacaoEntity(AvaliacaoRequest requestAvaliacao);

}
