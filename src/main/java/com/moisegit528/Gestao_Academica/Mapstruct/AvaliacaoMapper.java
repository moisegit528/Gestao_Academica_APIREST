package com.moisegit528.Gestao_Academica.Mapstruct;

import com.moisegit528.Gestao_Academica.Dto.request.AvaliacaoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import com.moisegit528.Gestao_Academica.Model.AvaliacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AvaliacaoMapper {

    AvaliacaoEntity avaliacaoEntity(AvaliacaoRequest requestAvaliacao); //converting request to entity
    AlunoResponse alunoResponse(AlunoEntity alunoEntity); // converting entity to response
    List<AlunoResponse> listResponse(List<AlunoEntity> alunoEntity); // converting list entity to list response

}
