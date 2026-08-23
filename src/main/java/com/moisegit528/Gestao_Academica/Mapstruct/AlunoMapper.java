package com.moisegit528.Gestao_Academica.Mapstruct;


import com.moisegit528.Gestao_Academica.Dto.request.AlunoRequest;
import com.moisegit528.Gestao_Academica.Dto.request.AlunoUpdateRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoUpdateResponse;
import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AlunoMapper {

    @Mapping(target = "id",  ignore = true)
    @Mapping(target = "dataMatricula", ignore = true)
    @Mapping(target = "statusMatricula", ignore = true)
    AlunoEntity entityAluno(AlunoRequest requestAluno); // convert request to entity
    AlunoResponse responseAluno(AlunoEntity entityAluno);// convert entity to response

    @Mapping(target = "nome", expression = "java(requestUpdateAluno.getNome() == null || requestUpdateAluno.getNome().isBlank() ? alunoEntity.getNome() : requestUpdateAluno.getNome())")
    @Mapping(target = "email", expression = "java(requestUpdateAluno.getEmail() == null || requestUpdateAluno.getEmail().isBlank ? alunoEntity.getEmail() : requestUpdateAluno.getEmail())")
    @Mapping(target = "telefone", expression = "java(requestUpdateAluno.getTelefone() == null || requestUpdateAluno.getTelefone().isBlank ? alunoEntity.getTelefone() : requestAlunoUpdate.getTelefone())")
    @Mapping(target = "dataNascimento", expression = "java(requestAlunoUpdate.getDataNascimento() == null || requestUpdateAluno.DataNascimento().isBlank ? alunoEntity.getDataNascimento : requestAlunoUpdate.getDataNascimento())")
    void updateRequestAluno(AlunoUpdateRequest requestUpdateAluno, @MappingTarget AlunoEntity alunoEntity);
    AlunoUpdateResponse responseAlunoUpdate(AlunoEntity entityAluno); // convert entity to response

    List<AlunoResponse> listaResponse(List<AlunoEntity> listaEntity); // convert list entity to list response

}
