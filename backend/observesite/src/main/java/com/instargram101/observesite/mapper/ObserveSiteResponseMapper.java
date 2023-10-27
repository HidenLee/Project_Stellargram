package com.instargram101.observesite.mapper;

import com.instargram101.observesite.dto.response.ObserveSiteResponse;
import com.instargram101.observesite.entity.ObserveSite;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ObserveSiteResponseMapper {

    ObserveSiteResponse toResponse(ObserveSite observeSite);

}
