package com.moisegit528.Gestao_Academica.Mapstruct;

import com.moisegit528.Gestao_Academica.Dto.request.CursoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.CursoResponse;
import com.moisegit528.Gestao_Academica.Model.CursoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "statusCurso", ignore = true)
    CursoEntity toEntity (CursoRequest request); // convert request to entity
    CursoResponse toResponse(CursoEntity entity);// convert entity to response
    List<CursoResponse> toResponseList(List<CursoEntity> list); // convert list entity to list response

}
