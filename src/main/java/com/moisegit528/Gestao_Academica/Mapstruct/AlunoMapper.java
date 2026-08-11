package com.moisegit528.Gestao_Academica.Mapstruct;


import com.moisegit528.Gestao_Academica.Dto.request.AlunoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

    @Mapping(target = "id",  ignore = true)
    @Mapping(target = "dataMatriula", ignore = true)
    @Mapping(target = "statusMatriula", ignore = true)
    AlunoEntity entityAluno(AlunoRequest requestAluno);
    AlunoRequest requestAluno(AlunoEntity entityAluno);
    List<AlunoResponse> listaResponse(List<AlunoEntity> listaEntity);
}
    